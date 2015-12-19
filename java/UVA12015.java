import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
 
public class UVA12015 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
	 
	    ArrayList<String> ans;
	    int N = sc.nextInt();
	    for (int i = 1; i <= N; i++) {
	    	int max = -1;
	    	ans = new ArrayList<String>();
	    	for (int j = 0; j < 10; j++) {
	    		String tmp = sc.next();
	    		int val = sc.nextInt();
	        if (val > max) {
	        	ans.clear();
	        	ans.add(tmp);
	        	max = val;
	        }else if (val == max) {
	        	ans.add(tmp);
	        	}
	    	}
	    	out.println("Case #" + i + ":");
	    	for (String t : ans) {
	    		out.println(t);
	    	}
	    }
	    out.close();
	    sc.close();
	}
}