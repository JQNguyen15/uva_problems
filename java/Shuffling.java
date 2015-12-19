import java.util.*;

public class Shuffling {

	public static int counter=0;
	public static int[] elements;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		String style=keyboard.next();
		elements = new int[n];
		initialize();
		if (style.equals("out")){
			for (;;){
				out();
				if (same())
					break;
			}
		}
		if (style.equals("in")){
			for (;;){
				in();
				if (same())
					break;
			}
		}
		System.out.println(counter);
	}
	
	public static void initialize(){
		for (int i=0;i<elements.length;i++)
			elements[i]=i;
	}

	public static void out(){
	
		if (elements.length%2==0){
			int[] firsthalf=new int[elements.length/2];
			int[] secondhalf=new int[elements.length/2];
			
			System.arraycopy(elements, 0,firsthalf, 0, firsthalf.length);
			System.arraycopy(elements, elements.length/2,secondhalf, 0, secondhalf.length);
			
			int j=0,k=0;
			for (int i=0;i<elements.length;i++){
				if (i%2==0){
					elements[i]=firsthalf[j];
					j++;
				}else{
					elements[i]=secondhalf[k];
					k++;
				}
			}
		}
		
		if (elements.length%2!=0){
			int[] firsthalf=new int[(elements.length/2)+1];
			int[] secondhalf=new int[elements.length/2];
			
			System.arraycopy(elements, 0,firsthalf, 0, firsthalf.length);
			System.arraycopy(elements, elements.length/2+1,secondhalf, 0, secondhalf.length);
			
			int j=0,k=0;
			for (int i=0;i<elements.length;i++){
				if (i%2==0){
					elements[i]=firsthalf[j];
					j++;
				}else{
					elements[i]=secondhalf[k];
					k++;
				}
			}
		}
		counter++;
	}
	
	public static void in(){
	
		if (elements.length%2==0){
			int[] firsthalf=new int[elements.length/2];
			int[] secondhalf=new int[elements.length/2];
			
			System.arraycopy(elements, 0,firsthalf, 0, firsthalf.length);
			System.arraycopy(elements, elements.length/2,secondhalf, 0, secondhalf.length);
			
			int j=0,k=0;
			for (int i=0;i<elements.length;i++){
				if (i%2==0){
					elements[i]=secondhalf[k];
					k++;
				}else{
					elements[i]=firsthalf[j];
					j++;
				}
			}
		}
		
		if (elements.length%2!=0){
			int[] firsthalf=new int[elements.length/2];
			int[] secondhalf=new int[elements.length/2+1];
			
			System.arraycopy(elements, 0,firsthalf, 0, firsthalf.length);
			System.arraycopy(elements, elements.length/2,secondhalf, 0, secondhalf.length);
			
			int j=0,k=0;
			for (int i=0;i<elements.length;i++){
				if (i%2==0){
					elements[i]=secondhalf[k];
					k++;
				}else{
					elements[i]=firsthalf[j];
					j++;
				}
			}
		}
		counter++;
	}
	
	
	public static Boolean same(){
		for (int i=0;i<elements.length;i++){
			if (elements[i]!=i)
				return false;
		}
		return true;
	}
	
	
}
