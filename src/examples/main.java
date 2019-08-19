package examples;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input a string: ");
		char letters[]= scanner.nextLine().toCharArray();
		System.out.println("reverse string: ");
		for(int i = letters.length-1; i>=0;i--) {
			System.out.print(letters[i]);
			
		}
	}

}