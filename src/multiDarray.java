
public class multiDarray {
public static void main(String [] args) {
	
	int bucky[][]= {{1,2,3,4},{5,6,7,8}};
	int bucky1[][]= {{9,10,11,12},{13},{14,15,16}};
	System.out.println("first array:");
	display(bucky);
	System.out.println("second array:");
	display(bucky1);
	
}
public static void display (int x[][]) {
	for(int row=0;row<x.length;row++) {
		for(int column=0;column<x[row].length;column++) {
			System.out.print(x[row][column]+"  ");
		}
		System.out.println();
	}
	}
}
