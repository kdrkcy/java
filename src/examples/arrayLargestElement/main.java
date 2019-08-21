//Write a Java program to find the largest element between first, last, 
//and middle values from an array of integers 
package examples.arrayLargestElement;

public class main {
	public static void main(String[] args) {
	int largest;
	int array[]= {54,23,65,11,76,10,13,17};
	int first,last,middle;
	first = array[0];
	last= array[array.length-1];
	middle=array[((array.length/2)%2==0 ? (array.length/2)-1 : (array.length/2))];
	
	if(first>last && first >middle) {
		largest=first;
	}else if(middle>last&middle>first) {
		largest=middle;
	}
	else {
		largest=last;
	}	
	System.out.println("largets elements between first middle and last digits in array :  "+largest);
	}

}
