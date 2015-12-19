import java.util.*;

public class uva12289 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int tests=kb.nextInt();
		for (int i=0;i<tests;i++){
			String input=kb.next();
			String one="one";
			String two="two";

			if (input.length()>3){
				System.out.println("3");
				continue;
			}
			int onez=0;
			if (input.charAt(0)=='o' && input.charAt(1)=='n'|| input.charAt(0)=='o'&&input.charAt(2)=='e'
					||input.charAt(1)=='n'&&input.charAt(2)=='e')
				System.out.println(1);
			else
				System.out.println(2);
		}
	}
}
