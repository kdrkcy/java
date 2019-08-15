
public class Compound {
	public static void main(String[] args) {
		double amount, principal=10000 , Rate=.01;
		int day;
		for(day=0;day<10;day++) {
			
			amount=principal*Math.pow(1+.01, day);
			System.out.println(day+ "     " +amount);
		}
	
	}
}
