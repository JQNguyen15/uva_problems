import java.util.*;
public class Main {

    public static void Bottled(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);

        int total=keyboard.nextInt();
        int big=keyboard.nextInt();
        int small=keyboard.nextInt();
        evaluate (total,big,small);
    }
    
    public static void evaluate(int n,int x,int y){
        int big,small=0;
        int soFar;
        big=n/x;

        soFar=big*x;
        int remainder=n-soFar;
        while (soFar>=0){
            while (remainder%y!=0){
                soFar-=x;
                big--;
                remainder=n-soFar;
                if (soFar<0){
                    System.out.println("Impossible");
                    return;
                }
            }
            if (soFar<0){
                System.out.println("Impossible");
                return;
            }
            if (remainder%y==0){
                small=remainder/y;
                System.out.println(big + " "+ small);
                return;
            }

        }
    }
    
}