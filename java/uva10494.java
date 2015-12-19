
import java.util.*;
import java.math.*;
public class uva10494 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while (kb.hasNext()){
				BigInteger n=new BigInteger(kb.next());
				String op=kb.next();
				BigInteger m=new BigInteger(kb.next());
				if (op.equals("/"))
					System.out.println(n.divide(m));
				else
					System.out.println(n.mod(m));
			}
		}
}
