
class RemoveAtIndex {
	public static int[] removeIndexElement(int[] array, int index) {
		int[] newArray = new int[array.length-1];
		int index1 = 0;
		for(int i=0; i<array.length; i++) {
			if(i != index)
				newArray[index1++] = array[i];
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6};
		System.out.print("The Elements of array are : ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		int[] array2 = removeIndexElement(myArray,5	);
		System.out.print("The Elements of array after removing Particular Index are : ");
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}
}