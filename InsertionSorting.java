class InsertionSorting {
	public static int[] sortingArray(int[] array) {
		for(int i = 1; i<array.length; i++) {
      		int temp = array[i];    
      		int j = i;
          	while(j>0  && temp<array[j-1]) {
                array[j] = array[j-1];
                j = j-1;
            }
           array[j] = temp;       
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