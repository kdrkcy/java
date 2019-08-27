package intermediatejava;
import java.util.*;
public class arraytolist {
	public static void main(String[] args) {
		
		String[] stuff = {"babies ","watermelon", "melons", "fudge"};
		LinkedList<String>list1 = new LinkedList<String>(Arrays.asList(stuff));
		list1.add("lastthing");
		list1.addFirst("firstthing");
		
		stuff = list1.toArray(new String[list1.size()]);
		
		for(String x : list1) {
			System.out.printf("%s ",x);
		}
		
	}
	
	
}
