package FileClass;
import java.io.File;
import java.util.*;
public class main {

	public static void main(String[] args) {
		File x = new File("C:\\Users\\KDRKCY\\eclipse-workspace\\LearnJava\\kdr.txt");
		if(x.exists()) {
			System.out.println(x.getName()+ " exists");
		}
		else {
			System.out.println("this file doesnt exists");
		}
		tuna obj = new tuna();
		obj.create();
		obj.addRecords();
		obj.closeFile();
		obj.openFile();
		obj.readfile();
		obj.closefile();
		
	}

	}
	


