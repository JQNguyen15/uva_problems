#include <iostream>

int main(){
	int t;
	std::cin>>t;
	for (int i=1;i<=t;i++){
		int a,b,num=0;
		std::cin>>a>>b;
		for (int j=a;j<=b;j++){
			if (j%2!=0)
				num+=j;
		}
		std::cout<<"Case "<<i<<": "<<num<<std::endl;
	}
	return 0;
}