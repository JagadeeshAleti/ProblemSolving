class MergeSorting {

	static void merge(int array[], int start, int mid, int end) {
		
		int temp[] = new int[end - start + 1];
		int i = start, j = mid+1, k = 0;

		while(i <= mid && j <= end) {
			if(array[i] <= array[j]) 
				temp[k++] = array[i++];
			
			else
				temp[k++] = array[j++];
		}

		while(i <= mid) 
			temp[k++] = array[i++];

		while(j <= end)
			temp[k++] = array[j++];

		for(i = start; i <= end; i += 1) 
			array[i] = temp[i - start];
		
}
	static int[] mergeSort(int[] array, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid+1, end);
			merge(array, start, mid, end);
		}
		return array;
	}
	public static void main(String[] args) {
		int[] myArray = {23,123,11,45,57,89};
		System.out.print("Array Before Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
		
		mergeSort(myArray,0,myArray.length-1);
		
		System.out.println();
		System.out.print("Array After Sorting : ");
		for(int i=0; i<myArray.length; i++) 
			System.out.print(myArray[i]+" ");
	}
}