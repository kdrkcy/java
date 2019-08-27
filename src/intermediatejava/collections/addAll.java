package intermediatejava.collections;
import java.util.*;
public class addAll {

	public static void main(String[] args) {
		
		String[] array= {"google","mozilla","safari"};
		List<String> l = Arrays.asList(array);
		
		for(String x:l) {
			System.out.printf("%s  ",x);
		
		}
		System.out.println();
		
		List<String> l2 = new ArrayList<String>();
		l2.add("youtube");
		l2.add("facebook");
		
		Collections.addAll(l2, array);
		System.out.printf("%s",l2);
		
	}
}
