
public class SetGet1 {
	private int hour;
	private int minute;
	private int second;
	
	public SetGet1() {
		this(0,0,0);
	}

	public SetGet1(int h) {
		this(h,0,0);
	}

	public SetGet1(int h, int m) {
		this(h,m,0);
	}

	public SetGet1(int h, int m, int s) {
		SetTime(h,m,s);
	}
	public void SetTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public void setHour(int h) {
		hour= ((h>=0&&h<24) ? h : 0);
	}
	
	public void  setMinute(int m) {
		minute= ((m>=0&&m<60)? m : 0);
	}
	public void  setSecond(int s) {
		second= ((s>=0&&s<60)? s : 0);
	}
	
	public int getHour() {
		return hour;
	}
	public int getSecond() {
		return second;
	}
	public int getMinute() {
		return minute;
	}
	
	public String ToMilitary() {
		return String.format("%2d : %2d : %2d", getHour(), getMinute(), getSecond());
	}
}


