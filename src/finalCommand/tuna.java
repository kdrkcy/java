package finalCommand;

public class tuna {
	private int sum;
	private final int NUMBER;
	
	public tuna(int x) {
		NUMBER=x;
	}

	public void add() {
		sum+=NUMBER;
		
	}
	public String toString() {
	return	String.format("%s\n", sum);
		
	} 



}
