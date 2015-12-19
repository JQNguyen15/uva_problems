import java.util.Arrays;
import java.util.Scanner;
public class uva10252 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		while (kb.hasNext()){
			StringBuilder s1 = new StringBuilder(kb.nextLine());
			StringBuilder s2 = new StringBuilder(kb.nextLine());

			char[] result = new char[1000];
			for (int i=0;i<result.length;i++)
				result[i]=' ';
			int c=0;
			for (int i=0;i<s1.length();i++){
				for (int j=0;j<s2.length();j++){
					if (s2.charAt(j)==s1.charAt(i)){
						result[c]=s2.charAt(j);
						s2.setCharAt(j,' ');
						s1.setCharAt(i,' ');
						c++;
						continue;
					}
				}
			}
			Arrays.sort(result);
			for (int i=0;i<result.length;i++){
				if (result[i]!=' ')
					System.out.printf("%c",result[i]);
			}
			System.out.println();
		}
	}
}
