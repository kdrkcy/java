package exceptionHandler;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		int x=1;
		do {
		try {
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter the first num");
		int num1= input.nextInt();
		System.out.println("enter the second num");
		int num2= input.nextInt();
		int sum = num1/num2;
		System.out.println("sum: " +sum);
		x=2;
		
		}
		catch(Exception e) {
			System.out.println("error");
		}
		
		}
		while(x==1);
	}
	

}
