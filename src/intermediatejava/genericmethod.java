package intermediatejava;

public class genericmethod {
 public static void main(String[] args) {
	 
	 Integer [] ray = {1,2,3,4,5};
	 Character [] charay= {'k','a','d','i','r'};
	 
	 printMe(ray);
	 printMe(charay);
	 System.out.println(max(12,344,56));
	 
	  }
 
 public static <T> void printMe(T[] x) {
	 for(T y: x) {
		 System.out.printf("%s ",y);
	 }
	 System.out.println();
 }

 public static <T extends Comparable<T>> T max(T a, T b ,T c) {
	 T m=a;
	 if(b.compareTo(m)>0)
		 m=b;
	 if(c.compareTo(m)>0)
		 m=c;
	 
	 return m;
 }
 
}
