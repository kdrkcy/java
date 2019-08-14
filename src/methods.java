import java.util.Scanner;
public class methods {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		methods1 tunaobject= new methods1();
		System.out.println("enter your fathers' name:");
		String name= input.nextLine();
		tunaobject.setName(name);
		tunaobject.saying();
	
	}
	
	
}

