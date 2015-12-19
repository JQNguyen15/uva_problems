import java.util.Arrays;
import java.util.*;
public class uva1339 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while(kb.hasNext()){
            String x=kb.nextLine();
            String y=kb.nextLine();
            if(solve(x, y)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
    static boolean solve(String x,String y){

        int[]arr1=new int[26],arr2=new int[26];
        for (int i = 0; i < x.length(); i++) {
            arr1[x.charAt(i)-65]++;
            arr2[y.charAt(i)-65]++;
        }
        /*
        for (int i=0;i<arr1.length;i++){
        	System.out.printf("%d ",arr1[i]);
        }
        System.out.println();
        for (int i=0;i<arr2.length;i++){
        	System.out.printf("%d ",arr2[i]);
        }*/
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        /*
        System.out.println();
        for (int i=0;i<arr1.length;i++){
        	System.out.printf("%d ",arr1[i]);
        }
        System.out.println();
        for (int i=0;i<arr2.length;i++){
        	System.out.printf("%d ",arr2[i]);
        }*/
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < 26; i++) {
           sb.append(arr1[i]);
           sb2.append(arr2[i]);
        }
        if(sb.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}