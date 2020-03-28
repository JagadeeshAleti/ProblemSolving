class HeapSorting {

	public static int[] buildHeap(int[] array) {
		int sizeOfArray = array.length; 
        
        // for finding max heap
        for (int i=sizeOfArray/2-1; i>=0; i--) 
            heapfy(array, sizeOfArray, i); 
		
		// for sorting the max Heap
		for (int i=sizeOfArray-1; i>=0; i--) {  
    		int temp = array[0];
     		array[0] = array[i];
     		array[i] = temp;
    		heapfy(array,i,0);	
        }

        return array;
	}

	public static void heapfy(int[] array, int size, int root) {
		int largest = root;
        int leftPosistion = 2*root + 1;  
        int rightPosistion = 2*root + 2;  
  
 
        if (leftPosistion<size && array[leftPosistion]>array[largest]) 
            largest = leftPosistion; 
  
        if (rightPosistion<size && array[rightPosistion] > array[largest]) 
            largest = rightPosistion;  
		
		if (largest != root) {
     		int temp = array[largest];
     		array[largest] = array[root];
     		array[root] = temp;
     		heapfy(array, size, largest);
   		}
	}

	public static void main(String[] args) {
		int[] myArray = {23,123,11,45,57,89};
		System.out.print("Array Before Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
		
		buildHeap(myArray);
		
		System.out.println();
		System.out.print("Array Before Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
	}
}