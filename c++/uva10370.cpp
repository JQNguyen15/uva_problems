#include <iostream>
#include <iomanip>
int main(){
	int c;
	std::cin>>c;
	for (int i=0;i<c;i++){
		int n;
		std::cin>>n;

		int array[n],avg=0,numabove=0;
		for (int j=0;j<n;j++){
			std::cin>>array[j];
			avg+=array[j];
		}
		avg/=n;
		for (int j=0;j<n;j++){
			if (array[j]>avg)
				numabove++;
		}
		double percentage=(double)(((double)numabove/(double)n)*100);
		//std::cout<<n<<" avg "<<avg<<" num above"<<numabove<<std::endl;
		std::cout<<std::fixed<<std::setprecision(3)<<percentage<<"\%"<<std::endl;
	}
	return 0;
}