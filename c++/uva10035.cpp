#include <iostream>

int countops(int a,int b){
	int count=0;
	int extra=0;
	while (a>0 || b>0){
		if (a%10+extra+b%10>=10){
			count++;
			a/=10;
			b/=10;
			extra=1;
		}else{
			a/=10;
			b/=10;
			extra=0;
		}
	}
	return count;
}

int main(){
	int a,b;
	for (;;){
		std::cin>>a>>b;
		if (a==0 && b==0)
			break;
		if (countops(a,b)==0)
			std::cout<<"No carry operation."<<std::endl;
		else if (countops(a,b)==1)
			std::cout<<"1 carry operation."<<std::endl;
		else
			std::cout<<countops(a,b)<<" carry operations."<<std::endl;
	}
	return 0;
}