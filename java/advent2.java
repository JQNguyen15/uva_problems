import java.util.*;
public class advent2 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int result=0;
		int totalribbon=0;
		while (kb.hasNext()){
			int w=0,l=0,h=0;
			String input=kb.nextLine();
			StringTokenizer myToken=new StringTokenizer(input,"x");
			while (myToken.hasMoreTokens()){
				w=Integer.parseInt(myToken.nextToken());
				l=Integer.parseInt(myToken.nextToken());
				h=Integer.parseInt(myToken.nextToken());
			}
			int a=l*w;
			int b=w*h;
			int c=h*l;
			int smallest=Math.min(Math.min(a,b), c);
			int smallestsides[]=new int[3];
			smallestsides[0]=l;
			smallestsides[1]=w;
			smallestsides[2]=h;
			
			Arrays.sort(smallestsides);

			totalribbon+=2*(smallestsides[0]+smallestsides[1]);
			totalribbon+=l*w*h;
			//totalribbon+=ribbon1+ribbon2;
			result+=(2*(l*w))+(2*(w*h))+(2*(h*l))+smallest;
			System.out.println(result);
			System.out.println("ribbon total "+totalribbon);
		}
		
	}
}
