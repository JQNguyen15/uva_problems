import java.util.*;
public class uva12279 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int num=1;
		for (;;){
			int t=kb.nextInt();
			int plus=0,minus=0;
			if (t==0)
				break;
			int[] array = new int[t];
			for (int i=0;i<t;i++){
				array[i]=kb.nextInt();
				if (array[i]!=0)
					plus++;
				else
					minus++;
			}
			System.out.println("Case "+num+": "+(plus-minus));
			num++;
		}
	}
}
