import java.util.*;
public class Mastermind {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int n=keyboard.nextInt();
		String codeMaker=keyboard.next();
		String decoder=keyboard.next();
		result(n,codeMaker,decoder);
	}
	
	public static void result(int n,String input1,String input2){
		int r=0,s=0;
		char[] charArray=input1.toCharArray();
		char[] charArray2=input2.toCharArray();
		for (int i=0;i<n;i++){
			if (charArray[i]==charArray2[i]){
				r++;
				charArray[i]=' ';
				charArray2[i]=' ';
			}
		}

		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (charArray[i]==charArray2[j] && charArray[i]!=' '){
					s++;
					charArray[i]=' ';
					charArray2[j]=' ';
				}
			}
		}
		System.out.println(r + " "+ s);
	}
}
