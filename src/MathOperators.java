import java.util.Scanner;

public class MathOperators {
	
	public static void main(String[] args) {
		
		Scanner bucky = new Scanner(System.in);
		
		double girls, boys, people,module;
		int ratio;
		
		girls = 11;
		boys = 3;
		people = girls+boys;
		module= girls%boys;
		ratio= (int)girls/(int)boys;
		System.out.println(people);
		System.out.println(module);
		System.out.println(ratio);
	}
	
	
}
