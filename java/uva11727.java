import java.util.*;
public class uva11727 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		for (int i=1;i<=t;i++){
			int[] array = new int[3];
			for (int j=0;j<3;j++)
				array[j]=kb.nextInt();
			Arrays.sort(array);
			System.out.println("Case "+i+": "+array[1]);
		}
	}
}
