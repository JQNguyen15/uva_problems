#include <iostream>
#include <string.h>
int main(){
	std::string input;
	char c;
	while (getline(std::cin,input)){
		for (int i=0;i<input.length();i++){
			c=input[i]-7;
			std::cout<<c;
		}
		std::cout<<std::endl;
	}
	return 0;
}