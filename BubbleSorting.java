class BubbleSorting {
	public static int[] sortingArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] myArray = {23,123,11,45,57,89};
		System.out.print("Array Before Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
		sortingArray(myArray);
		System.out.println();
		System.out.print("Array Before Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
	}
}