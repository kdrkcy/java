//Write a Java program to convert seconds to hour, minute and seconds

package examples.secondtotimetable;


import java.util.Scanner;

public class main {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("input seconds :   ");
	int seconds= input.nextInt();
	
	int h, m ,s;
	s=seconds%60;
	h=seconds/60;
	m=h%60;
	h=h/60;
	System.out.printf(seconds+" seconds equeal to : %d %d %d",h,m,s);
}

}
