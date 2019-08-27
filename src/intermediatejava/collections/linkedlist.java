package intermediatejava.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class linkedlist {
public static void main(String[] args) {
	String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
	List<String> list1= new LinkedList<String>();
	for(String x:things) {
		list1.add(x);
	}
	
	String[] morethings = {"sausage", "bacon", "goats", "harrypotter"};
	List<String> list2= new LinkedList<String>();
	for(String y:morethings) {
		list2.add(y);
	}
	
	list1.addAll(list2);
	list2=null;
	
	printMe(list1);
	removeStuff(list1,2,5);
	printMe(list1);
	reverseMe(list1);
	
	}

private static void removeStuff(List<String> l, int from, int to) {
	l.subList(from, to).clear();

}
public static void reverseMe(List<String> l) {
	
	ListIterator<String>iterator = l.listIterator(l.size());
	while(iterator.hasPrevious()) {
		System.out.printf("%s ",iterator.previous());
	}
	
}

private static void printMe(List<String> l) {
	for(String b : l) {
		System.out.printf("%s ",b);
	}
	System.out.println();


}




}
