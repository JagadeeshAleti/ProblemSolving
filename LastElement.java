public class LastElement {
	public static void printLastElement(int[] array) {
		System.out.println("First Element of the array : "+array[array.length-1]);
	}
	public static void main(String[] args) {
		int[] myArray = {11, 22, 33, 44};
		printLastElement(myArray);
	}
}		