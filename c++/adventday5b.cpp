#include <iostream>

bool pair(std::string a){
	for (int i=0;i<a.length();i++){
		char temp[2];
		if (i+1<a.length()){
			temp[0]=a[i];
			temp[1]=a[i+1];
		}
		for (int j=i+2;j<a.length();j++){
			if (a[j]==temp[0] && a[j+1]==temp[1])
				return true;
		}
	}
	return false;
}

bool repeat(std::string a){
	for (int i=0;i<a.length();i++){
		if (a[i]==a[i+2])
			return true;
	}
	return false;
}

int main(){
	std::string input;
	int count=0;
	while (getline(std::cin,input)){
		if (repeat(input) && pair(input))
			count++;
		std::cout<<count<<std::endl;
	}
	return 0;
}