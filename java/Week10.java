import java.util.*;

public class Week10 {
 
	public static void main(String[] args) {
		
		String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Scanner kb = new Scanner(System.in);
		String code = kb.next();
		//kb.close();
		String result="";
		int[] a = new int[code.length()];
		
		for (int i=0;i<a.length;i++){
			char temp=code.charAt(i);
			if (Character.isUpperCase(temp))
				a[i]=alphabets.indexOf(temp);
			else
				a[i]=alphabets.indexOf(Character.toUpperCase(temp));
		}
		
		a[0]+=5;
		if (a.length>1){
			for (int i=1;i<a.length;i++){
				a[i]+=a[i-1];
			}
		}
		
		for (int i=0;i<a.length;i++){
			if (a[i]>25)
				a[i]=a[i]%26;
		}

		for (int i=0;i<a.length;i++){
			result+=alphabets.charAt(a[i]);
		}
		
		result=result.toLowerCase();
		System.out.println(result);
		
	}
}
