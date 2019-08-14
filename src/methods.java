import java.util.Scanner;
public class methods {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		methods1 mobject= new methods1();
		System.out.println("enter your fathers' name:");
		String name= input.nextLine();
		mobject.setName(name);
		mobject.saying();
	
	}
	
	
}

