import java.util.Random;
public class Randomnum {

	public static void main(String[] args) {
		int counter=0;
		Random rand = new Random();
		int number;
		double num;
		while(counter<10) {
			number=1+rand.nextInt(6);
			System.out.println(number);
			counter++;
		}
		int count=counter;
		while(count<20) {
			num=(int)(Math.random()*6+1);
			System.out.println(num);
			count++;
		}
	}
}
