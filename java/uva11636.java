import java.util.Scanner;
public class uva11636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int placeholder=0;
		
		int[] y,answer;
		y=new int[2000];
		answer=new int[2000];
		
		Scanner numScanner=new Scanner(System.in);
	    for (number=0;number<=2000;number++)
	    {
	    	y[number]=numScanner.nextInt();
	    	
	        if (y[number]==-1)
	        {
	            placeholder=number;
	            break;
	        }
	
	        if (y[number]>8192)
	            answer[number]=14;
	        if (y[number]>4096 && y[number]<=8192)
	            answer[number]=13;
	        if (y[number]>2048 && y[number]<=4096)
	            answer[number]=12;
	        if (y[number]>1024 && y[number]<=2048)
	            answer[number]=11;
	        if (y[number]>512 && y[number]<=1024)
	            answer[number]=10;
	        if (y[number]>256 && y[number]<=512)
	            answer[number]=9;

	        if (y[number]>128 && y[number]<=256)
	            answer[number]=8;
	        if (y[number]>64 && y[number]<=128)
	            answer[number]=7;
	        if (y[number]>32 && y[number]<=64)
	            answer[number]=6;
	        if (y[number]>16 && y[number]<=32)
	            answer[number]=5;
	        if (y[number]>8 && y[number]<=16)
	            answer[number]=4;
	        if (y[number]>4 && y[number]<=8)
	            answer[number]=3;
	        if (y[number]==3 || y[number]==4)
	            answer[number]=2;
	        if (y[number]==2)
	            answer[number]=1;
	        if (y[number]==0 || y[number]==1)
	            answer[number]=0;
	    }
	    for (number=0;number<placeholder;number++)
	    {
	        System.out.printf("case %d: %d\n",number+1,answer[number]);
	    }
	}

}
