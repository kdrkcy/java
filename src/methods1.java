public class methods1{
	private String mother;
	public void setName(String name) {
		mother=name;
	}
	
	public String getName() {
		return mother;
	}
	
	public void saying() {
		System.out.println("your mother's name is " +getName());
	}
	
}