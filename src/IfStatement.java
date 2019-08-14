import java.util.Scanner;
public class IfStatement {

		public static void main(String[] args) {
			int test;
			Scanner bucky = new Scanner(System.in);
			System.out.println("enter a number: ");
			test =bucky.nextInt();
			if(test == 9) {
				System.out.println("yes");
			}
			else {
				System.out.println("this is else");
			}
			
			
		}
}
