//Write a Java method to count all words in a string.


package examples.methods;

import java.util.Scanner;
public class example2 {

  public static void main(String[] args)
    { 
	  Scanner input = new Scanner(System.in);
	  System.out.println("input a string");
	  String str= input.nextLine();
	  
	  System.out.println("number of the words in this string : "+ wordCounter(str));
       
    }
  
 public static int wordCounter(String x) {
	 
	 	int counter=0;
	 if(!(" ".equals(x.substring(0, 1)))|| !(" ".equals(x.substring(x.length()-1)))) {
		 
		 for(int i =0; i<x.length();i++) {
			 if(x.charAt(i)== ' ') {
				counter++;
			 }
			
		 }
		 counter= counter+1;
	 }
	 return counter;
 }

}
