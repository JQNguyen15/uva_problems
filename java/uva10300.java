import java.util.*;
public class uva10300 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		while (n!=0){
			int farmers = kb.nextInt();
			int result=0;
			while (farmers!=0){
				int size = kb.nextInt();
				int animals = kb.nextInt();
				int environment = kb.nextInt();
				result+=size*environment;
				farmers--;
			}
			System.out.println(result);
			n--;
		}
	}
}
