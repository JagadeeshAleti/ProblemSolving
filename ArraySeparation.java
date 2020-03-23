import java.util.*;

public class ArraySeparation {
	
	public static void printArray(int[] array,String separator) {
		for(int i=0 ; i<array.length ; i++) {
			if(i != array.length-1) {
				System.out.print(array[i]+separator);
			}
			else {
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Separator : ");
		String separator = obj.nextLine(); 
		int[] myArray = {1, 22, 333, 400, 5005, 9};
		printArray(myArray,separator);
	}
}