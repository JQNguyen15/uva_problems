import java.util.HashSet;
import java.util.Scanner;
 
public class uva10038 {
 
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	 
		while (s.hasNext()) {
			 int n = s.nextInt();
			 int[] arr = new int[n];
			 for (int i = 0; i < n; i++)
			 arr[i] = s.nextInt();
			 
			 HashSet<Integer> hs = new HashSet<Integer>();
			 
			 for (int i = 0; i < n - 1; i++) {
				 int abs = Math.abs(arr[i + 1] - arr[i]);
				 if (abs <= arr.length - 1 && abs > 0)
					 hs.add(abs);
				 else {
					 break;
				 }
			 }
			 if (hs.size() == arr.length - 1)
				 System.out.println("Jolly");
			 else
				 System.out.println("Not jolly");
			 
		}
	}
}