import java.util.*;
public class uva12403 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int total=0;
		for (int i=0;i<n;i++){
			String input=kb.next();
			if (input.matches("donate"))
				total+=kb.nextInt();
			
			if (input.matches("report"))
				System.out.println(total);
		}
	}
}
