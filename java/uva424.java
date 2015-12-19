import java.util.*;
import java.math.BigInteger;
public class uva424 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		BigInteger sum = new BigInteger("0");
		BigInteger temp;
		while (kb.hasNext()){
			temp=kb.nextBigInteger();
			if (temp.compareTo(BigInteger.valueOf(0))==0)
				break;
			sum=sum.add(temp);
		}
		System.out.println(sum);

	}
}
