
public class SetGet {
	public static void main(String [] args) {
		
		SetGet1 obj =new  SetGet1();
		SetGet1 obj2 =new  SetGet1(12);
		SetGet1 obj3 =new  SetGet1(12,7);
		SetGet1 obj4 =new  SetGet1(12,7,6);
		
		System.out.printf("%s\n", obj.ToMilitary());
		System.out.printf("%s\n", obj2.ToMilitary());
		System.out.printf("%s\n", obj3.ToMilitary());
		System.out.printf("%s\n", obj4.ToMilitary());
		
	}
}
