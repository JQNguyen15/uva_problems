#include <iostream>


long long solution(int n){
	long long prevresult=2;
	long long result=8;
	int i=2;
	if (n==1)
		return prevresult;
	else if (n==2)
		return result;

	while (i<=n){
		result=(i*i)+i+prevresult;
		prevresult=result;
		i++;
	}
	return result;
}

int main(){
	int t;
	std::cin>>t;
	int n;
	for (int i=1;i<=t;i++){
		std::cin>>n;
		std::cout<<"Case "<<i<<": "<<solution(n)%1000000007<<std::endl;
	}
	return 0;
}