import java.util.Scanner;
public class LogicalOperators {
	public static void main(String[] args) {
		
		Scanner x =new Scanner(System.in);
		Scanner y= new Scanner(System.in);
		System.out.println("enter the age of boy");
		int boy= x.nextInt();
		System.out.println("enter the age of girl");
		int girl= y.nextInt();
	
		
		if (boy>10 && girl<60) {
			System.out.println("you can enter room #1!");
		}
		else  {
			System.out.println("you cannot enter room #1");
		}
		
		if (boy>20 || girl<50) {
			System.out.println("you can enter room #2!");
		}
		else  {
			System.out.println("you cannot enter room #2");
		}
		
	}
}
