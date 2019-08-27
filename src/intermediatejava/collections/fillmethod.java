package intermediatejava.collections;
import java.util.*;
public class fillmethod {
	public static void main(String[] args) {
		
		Character[] ray = {'a','b','c'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("list is :");
		output(l);
		
		Character[] newray= new Character[3];
		List<Character> l2 = Arrays.asList(newray);
		
		Collections.copy(l2, l);
		System.out.println("list copy");
		output(l2);
		
		Collections.reverse(l);
		System.out.println("reverse list");
		output(l);
		
		
		Collections.fill(l, 'X');
		System.out.println("filling with 'X'");
		output(l);
		
		
					
	}

	private static void output(List<Character> list) {
		for(Character x:list) {
			System.out.printf("%s ",x);
		}
		
		System.out.println("\n");
	}
	

}
