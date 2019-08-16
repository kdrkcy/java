
public class argumentlegth {
	public static void main(String[] args) {
		
		
		System.out.println(average(12,24,36,48));
		
	}

public static int average(int...numbers) {
	
	int total=0;
	for(int x:numbers ) {
		total+=x;
		
		
	}
	return total/numbers.length;
}

}
