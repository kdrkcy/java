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
		l2.add("google");
		
		Collections.addAll(l2, array);
		for(String n: l2)
		System.out.printf("%s  ",n);
		
		System.out.println("\n" +Collections.frequency(l2, "google"));
		boolean tof= Collections.disjoint(l, l2);
		System.out.println(tof);
		if(tof) {
			System.out.println("they have something in common");
		}
		else {
			System.out.println("they dont have something in common");
		}
		
	}
}
