//Write a Java program that accepts three integers from the user and return true 
//if two or more of them (integers ) have the same rightmost digit.

package examples.equalLastDigits;


import java.util.*;
public class main {
public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Input the first number : ");
       int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
       int z = in.nextInt(); 
       System.out.print("The result is: "+test_last_digit(x, y, z));
		System.out.print("\n");
   }
  
   public static String test_last_digit(int p, int q, int r)
    {
	   if((p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10))
	   {
	     return "true";
	   }
	     else
	       return "false";
	     
	     
	     }
    }

