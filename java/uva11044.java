import java.util.*;
public class uva11044 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int t=kb.nextInt();
		for (int i=0;i<t;i++){
			int a=kb.nextInt(),b=kb.nextInt();
			System.out.println((a/3)*(b/3));
		}
	}
}
