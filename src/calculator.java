import java.util.Scanner;

public class calculator {
	
		public static void main (String[] args) {

			Scanner bucky = new Scanner(System.in);
			
			double fnum, snum, answer;
			
			System.out.println("enter first num: ");
			fnum=bucky.nextDouble();
			System.out.println("enter second num");
			snum= bucky.nextDouble();
			answer = fnum + snum;
			
			System.out.println("sum of the numbers is " +answer);
			
		}
}
