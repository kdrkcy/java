
public class toString3 {
	private String name;
	private toString2 birthday;
	
	public toString3(String name , toString2 birthday) {
		this.name=name;
		this.birthday=birthday;
		
	}
	
	public String toString() {
		return String.format("my name is %s,  my birthday is  %s", name , birthday);
	}
}
