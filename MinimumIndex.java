import java.util.ArrayList; 
class MinimumIndex {
	public static int getMinimumIndex(int[] array) {
		int minElement = array[0];
		int index = 0;
		for(int i=1; i<array.length; i++) {
			if(array[i]<minElement) {
				minElement = array[i];
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] myArray = {11, 22, 33, 44,};
		System.out.println("The Index of minimum Element is "+getMinimumIndex(myArray));
	}
}