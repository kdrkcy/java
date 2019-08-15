import java.util.Scanner;
public class average {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int total=0;
		int grade;
		int average;
		int counter=0;
		
		while(counter<10) {
			int student=counter+1;
			System.out.println("enter the " +student + ". students grade");
			grade=input.nextInt();
			total+=grade;
			counter++;
			
		}
		average=total/counter;
		System.out.println("the average grade is " +average);
		
	}

}
