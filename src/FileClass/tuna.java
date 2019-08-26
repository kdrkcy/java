package FileClass;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class tuna {
	private Formatter y;
	public void create() {
		
		try {
			y =new Formatter("id.txt");
			System.out.println("you created a file");
		}
		catch(Exception e) {
			System.out.println("you encountered an error");
		}
	}
	
	public void addRecords() {
		y.format("%s %s %s \n%s %s %s ","kadir","25","Turkey","John","16","usa");

	}	
	public void closeFile() {
		y.close();
	}
	private Scanner s;
	public void openFile() {
		
		try {
			s= new Scanner(new File("id.txt"));
		} catch (Exception e) {
			System.out.println("error!");
		}
		
	
		
	}
public void readfile() {
	while(s.hasNext()) {
		String a =s.next();
		String b =s.next();
		String c =s.next();
	System.out.printf("%s %s %s\n", a,b,c);
	
	}
		
	}
public void closefile() {
	s.close();
}


}


