
public class nestedIf {

		public static void main(String[] args) {
			
			int age=60;
			if (age<50) {
				System.out.println("you are young");
				}
			else {
				System.out.println("you are old");
				if (age >75) {
					System.out.println("you are really old");
				}
				else {
					System.out.println("you are not that old");
				}
			}
			
			
		}
}
