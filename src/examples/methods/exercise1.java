//Write a Java method to find the smallest number among three numbers

package examples.methods;
import java.util.Scanner;
public class exercise1 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("input 3 numbers");
			System.out.println("input num1 :");
			int num1=input.nextInt();
			System.out.println("input num2 :");
			int num2=input.nextInt();
			System.out.println("input num3 :");
			int num3=input.nextInt();
			smallest(num1, num2, num3);
		}
		
		public static void smallest(int x, int y, int z) {
			int t =Math.min(Math.min(x, y), z);
			System.out.println("smallest number :" +t);

		}
		
		 
}
