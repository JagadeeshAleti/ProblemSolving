class MaximumIndex {
	public static int getMaximumIndex(int[] array) {
		int maxElement = array[0];
		int index = 0;
		for(int i=1; i<array.length; i++) {
			if(array[i]>maxElement) {
				maxElement = array[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] myArray = {23,12,431,43,3243,34};
		System.out.println("The Maximum Element Index of the array is "+getMaximumIndex(myArray));
	}
}