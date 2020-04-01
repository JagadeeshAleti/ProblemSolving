import java.util.Scanner;

class PatternOfPrime {
	
	public static boolean checkPrime(int num) {
   		int temp=0;
   		for( int i=1; i<=num; i++) {
      		if (num % i == 0)
         		temp++;
   		}
   		if (temp==2)
   			return true;
   		else
			return false;
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
        	System.out.print("Enter no. of rows : ");
        	int rows = sc.nextInt();
        	int number = 2;    
         	for (int i=1; i<=rows; i++) {
         		for (int j=1; j<=i; j++) {
			        while(!checkPrime(number)){
            			number++;
            		}
        			System.out.print((number++)+" ");
        			
      			}
      			System.out.println();
   			}

	}
}