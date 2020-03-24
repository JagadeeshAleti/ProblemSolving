class SelectionSorting {
	public static int[] sortingArray(int[] array) {
		int small_pos;
		for(int i=0; i<array.length; i++) {
			small_pos = findSmallestElement(array,i);
			int temp = array[i];
			array[i] = array[small_pos];
			array[small_pos] = temp;
		}
		return array;
	}

	public static int findSmallestElement(int[] array,int i) {
		    int smallest_Element,posistion,j;  
    		smallest_Element = array[i];  
    		posistion = i;  
    		for(j=i+1; j<array.length; j++) {  
        		if(array[j]<smallest_Element) {  
            		smallest_Element = array[j];  
            		posistion=j;  
        		}  
    		}  
    		return posistion;  
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