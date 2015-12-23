#include <iostream>
#include <algorithm>
int main(){
	int n;
	std::cin>>n;
	for (int i=0;i<n;i++){
		int r,result=0,median;
		std::cin>>r;
		int street[r];
		for (int j=0;j<r;j++)
			std::cin>>street[j];
		
		std::sort(street,street+r);

		if (r%2!=0)
			median=street[r/2];
		else
			median=(street[r/2]+street[(r/2)-1])/2;
		//std::cout<<median<<std::endl;
		for (int j=0;j<r;j++){
			result+=abs(median-street[j]);
		}
		std::cout<<result<<std::endl;
	}
	return 0;
}