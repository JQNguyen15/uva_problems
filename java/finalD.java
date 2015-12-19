import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class finalD {
	static int cases;
	static char[] s=new char[10000];
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		cases=kb.nextInt();
		kb.nextLine();
		while (cases>0){
			String temp = kb.nextLine();
			s=temp.toCharArray();
			PriorityQueue<Character> tree = new PriorityQueue<Character>();
			int level=0,max_level=0;
			for (int i=0;i<temp.length()-1;i++){
				if (Character.isUpperCase(s[i])){
					tree.add(s[i]);
					level++;
					if (max_level<level)
						max_level=level;
				}
				else{
					tree.add(s[i]);
					while (tree.size()%2==0)
						level--;
				}
			}
			char tempchar=tree.peek();
			while (max_level+1!=0){
				while (Character.isLetter(tempchar)){
					System.out.printf("%c",tree.remove());
					tree.remove();
				}
				max_level--;
			}
			
			cases--;
		}
	}
}