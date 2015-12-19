import java.util.*;
import java.math.BigInteger;
public class uva10106 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		while (kb.hasNext()){
			BigInteger a=new BigInteger(kb.next());
			BigInteger b=new BigInteger(kb.next());
			System.out.println(a.multiply(b));
		}
	}
}
