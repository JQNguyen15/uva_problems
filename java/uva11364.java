import java.util.*;
public class uva11364 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int t=kb.nextInt();
		for (int i=0;i<t;i++){
			int n=kb.nextInt();
			int[] array=new int[n];
			for (int j=0;j<n;j++)
				array[j]=kb.nextInt();
			Arrays.sort(array);
			System.out.println(2*(array[n-1]-array[0]));
		}
	}
}
