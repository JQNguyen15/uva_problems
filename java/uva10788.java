

import java.util.Scanner;
public class uva10788{
	static Boolean DEBUG=false;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int t,cases=1;
		int[][] array=new int[128][128];
		String input;
		t=keyboard.nextInt();
		if (DEBUG) System.out.println("test cases "+t);
	
		for (int i=0;i<=t;i++){
			input=keyboard.nextLine();
			if (DEBUG) System.out.println(input);
			if (i>=1){
				int length=input.length();
			
				for (int c=1;c<length;c++){
					for (int c2=0;c2+c<length;c2++){
						if (c==1){
							if (input.charAt(c2)==input.charAt(c2+1)){//if first 2 chars are same put 1
								array[c2][c2+1]=1;
							}else
								array[c2][c2+1]=0;
						}
						else{
							if (input.charAt(c2)==input.charAt(c+c2)){
								array[c2][c2+c]+=array[c2+1][c2+c-1];
							}
							for (int c3=c2+1;c3<c2+c-1;c3++){
								if (input.charAt(c2)==input.charAt(c3)){
									for (int c4=c3+1;c4<=c2+c-1;c4++){
										if (input.charAt(c4)==input.charAt(c2+c)){
											int a;
											if (c3+1==c4)
												a=1;
											else
												a=array[c3+1][c4-1];
											array[c2][c2+c]+=array[c2][c3]*array[c4][c2+c]*a;
										}
									}
								}
							}
						}
						array[c2][c2+c]=Math.min(array[c2][c2+c],2);
					}
				}
				if (array[0][length-1]==2)
					System.out.println("Case "+cases+": "+"Valid Multiple");
				else if (array[0][length-1]==1)
					System.out.println("Case "+cases+": "+"Valid Unique");
				else if (array[0][length-1]==0)
					System.out.println("Case "+cases+": "+"Invalid");
				cases++;
			}

		}
		keyboard.close();
		}
	
	}


