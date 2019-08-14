public class methods1{
	private String father;
	public void setName(String name) {
		father=name;
	}
	
	public String getName() {
		return father;
	}
	
	public void saying() {
		System.out.println("your father's name is " +getName());
	}
	
}