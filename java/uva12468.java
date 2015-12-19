import java.util.*;
public class uva12468 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		for (;;){
			int a = kb.nextInt();
			int b = kb.nextInt();
			if (a==-1 && b==-1)
				break;
			int result=Math.abs(a-b);
			if (result>50)
				result=100-result;
			System.out.println(result);
		}
	}
}
