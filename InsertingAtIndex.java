class InsertingAtIndex {
	public static int[] insertingAtIndex(int[] array , int index , int value) {
		int[] newArray = new int[array.length+1];
	
		for(int i=0; i<newArray.length; i++) {
			if(i < index)
				newArray[i] = array[i];
			else if(i==index)
				newArray[i] = value;
			else 
				newArray[i] = array[i-1]; 
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] myArray = {1,2,3,5,6};
		System.out.print("The Elements of array are : ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		int[] array2 = insertingAtIndex(myArray,3,4);
		System.out.print("The Elements of array after removing Particular Index are : ");
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}
}
