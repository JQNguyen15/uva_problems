#include <iostream>
#include <cstring>
using std::string;

bool disallowed(string n){
	for (int i=0;i<n.length();i++){
		if (n[i]=='a' && n[i+1]=='b')
			return false;
		else if (n[i]=='c' && n[i+1]=='d')
			return false;
		else if (n[i]=='p' && n[i+1]=='q')
			return false;
		else if (n[i]=='x' && n[i+1]=='y')
			return false;
	}
	return true;
}

bool vowels(string n){
	string vowels="aeiou";
	int count=0;
	for (int i=0;i<vowels.length();i++){
		for (int j=0;j<n.length();j++){
			if (n[j]==vowels[i])
				count++;
		}
	}
	if (count>=3)
		return true;
	else 
		return false;
}

bool repeats(string n){
	for (int i=0;i<n.length();i++){
		if (n[i]==n[i+1])
			return true;
	}
	return false;
}

int main(){
	string input;
	int nice=0;
	while (getline(std::cin,input)){
		if (disallowed(input)&& repeats(input) && vowels(input))
			nice++;
		std::cout<<nice<<std::endl;
	}
	return 0;
}