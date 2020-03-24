class QuickSorting {
	
	public static int partition(int array[], int low, int high) { 
		int pivot = array[high]; 
		int i = (low-1); 
		for (int j=low; j<high; j++) {  
			if (array[j] <= pivot) { 
				i++; 
				int temp = array[i]; 
				array[i] = array[j]; 
				array[j] = temp; 
			} 
		} 

		int temp = array[i+1]; 
		array[i+1] = array[high]; 
		array[high] = temp; 

		return i+1; 
	} 
	public static int[] sortingArray(int[] array,int low ,int high) {
		if (low < high) { 
			int pi = partition(array, low, high); 
			sortingArray(array, low, pi-1); 
			sortingArray(array, pi+1, high); 
		} 
		return array;
	}

	public static void main(String[] args) {
		int[] myArray = {23,123,11,45,57,89};
		System.out.print("Array Before Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
		
		sortingArray(myArray,0,myArray.length-1);
		
		System.out.println();
		System.out.print("Array After Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
	}
}