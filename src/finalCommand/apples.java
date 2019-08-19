package finalCommand;

public class apples {
	public static void main (String [] args) {
		
		tuna tunaObject = new tuna(10);
		for(int counter=0;counter<5;counter++) {
		tunaObject.add();	
		System.out.printf("%s" , tunaObject);
		}
	}
}
