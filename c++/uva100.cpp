#include <iostream>
#include <sstream>
using namespace std;


int evaluate(int n){
	int result=1;
	for (;;){
		if (n==1)
			break;
		if (n%2!=0)
			n=3*n+1;
		else
			n/=2;
		result++;
	}
	return result;
}

int main()
{
	string input;
	while (getline(cin,input)){
		int max=0;
		stringstream mytoken(input);
		int i,j,numberTotal;
		mytoken>>i>>j;
		int tempi=i,tempj=j;
		if (tempi>tempj){
			int temp=tempj;
			tempj=tempi;
			tempi=temp;
		}
		
		for (int n=tempi;n<=tempj;n++){
			if (evaluate(n)>max)
				max=evaluate(n);
		}
		cout<<i<<" "<<j<<" "<<max<<endl;
		mytoken.str("");
	}
	return 0;
}