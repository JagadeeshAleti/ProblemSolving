class EXORPairsInArray {
	public static void main(String[] args) {
		int[] array = {24,12,34,45,48};
		int len = (array.length*(array.length-1))/2;
		int[] array2 = new int[len];
		int currentLength = 0;
			
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(currentLength<=len)		
					array2[currentLength++] = array[i]^array[j]; 
			}
		}
		System.out.print("EXOR array of original array : ");
		for(int i=0; i<len; i++)
			System.out.print(array2[i]+" ");
		
		int totalEXOR = 0;
		for(int i=0; i<array2.length; i++) 
			totalEXOR = totalEXOR^array2[i];
		System.out.print("\nSum Of EXORed elemnts in array2 : "+totalEXOR);
		System.out.println();
	}
}