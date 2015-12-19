
import java.util.*;
import java.util.regex.*;

public class uva494 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String input;
		while (kb.hasNextLine()){
			input=kb.nextLine();
			Pattern p=Pattern.compile("[a-zA-Z]+");
			Matcher match=p.matcher(input);
			int counter = 0;
			while (match.find()) 
				counter++;
			
			System.out.println(counter);
		}
	}
}
