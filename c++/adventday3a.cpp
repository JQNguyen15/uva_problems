#include <iostream>
#include <stdio.h>

int main(){
	int grid[500][500];

	int x=250,y=250;
	for (int i=0;i<500;i++)
				for (int j=0;j<500;j++)
					grid[i][j]=0;

	grid[250][250]=1;
	std::string input;
	std::cin>>input;
	for (int i=0;i<input.length();i++){
		if (input[i]=='>'){
			x=x+1;
			grid[x][y]=1;
		}else if (input[i]=='<'){
			x=x-1;
			grid[x][y]=1;
		}else if (input[i]=='^'){
			y=y-1;
			grid[x][y]=1;
		}else if (input[i]=='v'){
			y=y+1;
			grid[x][y]=1;
		}
	}
	int num=0;
	for (int i=0;i<500;i++)
		for (int j=0;j<500;j++)
			if (grid[i][j]==1)
				num++;

	std::cout<<num;
	return 0;
}