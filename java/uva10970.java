import java.util.Scanner;
public class uva10970 {

	public static void main(String[] args) {
		int n,m;
		Scanner kb = new Scanner(System.in);
		while (kb.hasNextInt()){
			m=kb.nextInt();
			n=kb.nextInt();
			System.out.println(m-1+(m*(n-1)));
		}

	}

}
