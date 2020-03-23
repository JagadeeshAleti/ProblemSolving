class SwappingAtIndices {

	public static int[] swappingAtIndices(int[] array, int index1, int index2) {
		int temp = array[index2];
		array[index2] = array[index1];
		array[index1] = temp;

		return array;
	}

	public static void main(String[] args) {
		int[] myArray = {12,43,453,35,23};
		System.out.print("The Array Elements are : ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		swappingAtIndices(myArray,2,4);
		System.out.print("The Array Elements after Swapping are : ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
	}
}