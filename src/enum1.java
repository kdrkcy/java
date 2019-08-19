public class enum1 {

	public static void main(String [] args) {
		
		for(enum2 people: enum2.values()) {
			
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(),people.getYear());
		}
		
	}
	
	
}
