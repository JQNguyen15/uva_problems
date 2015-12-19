import java.util.*;
public class uva10550 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		for (;;){
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			int d=kb.nextInt();
			if (a==0&&b==0&&c==0&&d==0)
				break;
			int result=1080;
			if (a<b)
				result+=(40+a-b)*9;
			else
				result+=(a-b)*9;
			if (b>c)
				result+=(40+c-b)*9;
			else
				result+=(c-b)*9;
			if (c<d)
				result+=(40+c-d)*9;
			else
				result+=(c-d)*9;
			
			System.out.println(result);
		}
	}
}
