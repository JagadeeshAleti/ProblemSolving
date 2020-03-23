public class printArray {
	public static void printFrom2nd(int[] array) {
		for(int i=1; i<=array.length-1; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] myArray = {11, 22, 33, 44};
		printFrom2nd(myArray);
	}
}