import java.util.*;
public class uva12250 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int cases=1;
		String english="HELLO";
		String spanish="HOLA";
		String german="HALLO";
		String french="BONJOUR";
		String italian="CIAO";
		String russian="ZDRAVSTVUJTE";
		String end="#";
		for (;;){
			String input=kb.next();
			if (input.matches(end))
				break;

			if (input.matches(english))
				System.out.print("Case "+cases+": ENGLISH");
			else if (input.matches(spanish))
				System.out.print("Case "+cases+": SPANISH");
			else if (input.matches(german))
				System.out.print("Case "+cases+": GERMAN");
			else if (input.matches(french))
				System.out.print("Case "+cases+": FRENCH");
			else if (input.matches(italian))
				System.out.print("Case "+cases+": ITALIAN");
			else if (input.matches(russian))
				System.out.print("Case "+cases+": RUSSIAN");
			else 
				System.out.print("Case "+cases+": UNKNOWN");
			System.out.println();
			cases++;
		}
	}
}
