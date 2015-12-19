import java.util.*;
public class uva11059 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int count=1;
		while (kb.hasNext()){
			int n = kb.nextInt();
			int[] a = new int[n];
			for (int i=0;i<n;i++)
				a[i]=kb.nextInt();
			int max=0;
			for (int i=0;i<a.length;i++){
				for (int j=i;j<a.length;j++){
					int currentMax=1;
					for (int k=i;k<=j;k++)
						currentMax*=a[k];
					max=Math.max(max,currentMax);
					System.out.println(currentMax);
				}
			}
			System.out.printf("Case #%d: The maximum product is %d.\n\n",count,max);
			count++;
		}
	}
}
