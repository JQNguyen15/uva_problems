#include <iostream>

int main(){
	int n=1;
	int i=2;

	while (n!=1500){
		if (i%2==0 || i%3==0 || i%5==0){
			n++;
		}
		i++;
	}
	std::cout<<"The 1500'th ugly number is "<<i<<"."<<std::endl;
	return 0;
}