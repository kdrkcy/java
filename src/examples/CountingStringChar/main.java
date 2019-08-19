package examples.CountingStringChar;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		int counter=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("input a string ;");
		char sentence[]= scanner.nextLine().toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0;i<sentence.length;i++) {
		if(Character.isLetter(sentence[i])) {
		letter++;
		}
		else if(Character.isSpaceChar(sentence[i])) {
		space++;
		}
		
		else if(Character.isDigit(sentence[i])) {
			num++;
			}
		else {
			other++;}
		}
		
		System.out.println("number of digits in this sentence:\n  "+num  );
		System.out.println("number of spaces in this sentence:\n  "+space  );
		System.out.println("number of letters in this sentence:\n  "+letter  );
		System.out.println("number of other characters in this sentence:\n  "+other  );
	}
}
