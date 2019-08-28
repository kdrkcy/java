package intermediatejava;

public class genericmethod {
 public static void main(String[] args) {
	 
	 Integer [] ray = {1,2,3,4,5};
	 Character [] charay= {'k','a','d','i','r'};
	 
	 printMe(ray);
	 printMe(charay);
	 
	  }
 
 public static <T> void printMe(T[] x) {
	 for(T y: x) {
		 System.out.printf("%s ",y);
	 }
	 System.out.println();
 }

 
 
}
