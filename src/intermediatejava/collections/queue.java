package intermediatejava.collections;
import java.util.*;
public class queue {
	public static void main(String[] args) {
		PriorityQueue<String> q= new PriorityQueue<String>();
		
		q.offer("texas");
		q.offer("hawaii");
		q.offer("ohio");
		
		System.out.printf("%s",q);
		System.out.println();
		
		System.out.printf("%s", q.peek());
		System.out.println();
		q.poll();
		System.out.printf("%s",q);
	}
	

}
