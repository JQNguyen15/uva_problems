import java.util.*;
public class uva10976 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int k,x,y,count=0;
		while (kb.hasNext()){
			k = kb.nextInt();
			for (int i=k+1;i<=2*k;i++){
				if ((i*k)%(i-k)==0)
					count++;
			}
			System.out.println(count);
	
			for (int i=k+1;i<=2*k;i++){
				if ((i*k)%(i-k)==0)
					System.out.printf("1/"+k+" = 1/"+(i*k)/(i-k)+" + 1/"+i+"\n");
			}
			count=0;
		}
	}
}