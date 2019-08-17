
public class toString2 {

	private int month;
	private int day;
	private int year;
	
	public toString2(int month, int day, int year) {
		this.month=month;
		this.day=day;
		this.year=year;
	
		System.out.printf("my birthday is: %s \n",this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d",month,day,year );
	}
	
	
}
