package intermediatejava.collections;
import java.util.*;
public class sortmethod {

	public static void main(String[] args) {
		String[] states= {"florida","texas","california","hawaii"};
		List<String> l1 = Arrays.asList(states);
		
		Collections.sort(l1);
		System.out.printf("%s\n ",l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s",l1);
	}
}
