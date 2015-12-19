import java.util.*;
public class uva11547 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		for (int i=0;i<t;i++){
			long n = kb.nextLong();
			n=n*567;
			n=n/9;
			n+=7492;
			n*=235;
			n/=47;
			n-=498;
			System.out.println(Math.abs((n%100)/10));
		}
	}
}
