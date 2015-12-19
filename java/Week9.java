public class Week9 {

	public static void main(String[] args) {
	int n1,n2,n3;
	int[] results=new int[16];
	int j=0;
	for (int i=1000;i<=3339;i++){
		n1=i;
		n2=i+3330;
		n3=i+3330+3330;
		if ( checkPrime(n1) && checkPerm(n1,n2) && checkPrime(n2) && checkPerm(n2,n3) && checkPrime(n3)){
			results[j]=n1;
			j++;
			results[j]=n2;
			j++;
			results[j]=n3;
			j++;
		}
		}
		for (int c=0;c<results.length;c++){
			if (results[c]!=0)
				System.out.println(results[c]);
		}
	}

	public static Boolean checkPrime(int a){
		for (int i=2;i<a;i++){
			if (a%i==0)
				return false;
		}
		return true;
	}
	
	public static Boolean checkPerm(int a,int b){
		StringBuilder one=new StringBuilder(Integer.toString(a));
		StringBuilder two=new StringBuilder(Integer.toString(b));
		if (one.length()!=two.length())
			return false;
		for (int i=0;i<one.length();i++){
			for (int j=0;j<two.length();j++){
				if (one.charAt(i)==two.charAt(j))
					one.setCharAt(i,' ');
			}
		}
		for (int i=0;i<one.length();i++){
			if (one.charAt(i)!=' ')
				return false;
		}
		return true;
	}
	
}
