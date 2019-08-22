package polymorphism;

public class main {
	public static void main(String [] args) {
	potpie obj = new potpie();
	food obj2 = new tuna();	
	obj2.eat();
	food obj3 = new potpie();
	obj.eat();
	
	}
}
