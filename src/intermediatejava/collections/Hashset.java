package intermediatejava.collections;
import java.util.*;
public class Hashset {
public static void main(String[] args) {
	String[] states = {"hawaii","florida","arizona","hawaii"};
	List<String> list = Arrays.asList(states);
	List<String> list2 = new ArrayList<String>();

	System.out.printf("%s",list);
	System.out.println();
	Set<String> set= new HashSet<String>(list);
	System.out.printf("%s",set);
	
	Set<String> set2= new HashSet<String>(list2);
	set2.add("kdr");
	set2.add("mdr");
	set2.add("cdr");
	
	Iterator<String> i = set2.iterator();
	System.out.println();
	while(i.hasNext()) {
	System.out.println(i.next());
	}
}
}
