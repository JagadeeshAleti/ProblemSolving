import java.util.Scanner;	
class Patterns {

	static void starPattern1(int rows) {
		System.out.println("************* This is the starPattern Pattern ***************");
		System.out.println();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<rows-i; j++) 
				System.out.print("*");
			for(int j=0; j<2*i; j++)
				System.out.print(" ");
			for(int j=0; j<rows-i; j++) 
				System.out.print("*");	
			System.out.println();
		}

	}

	static void starPattern2(int rows) {
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2*(rows-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) 
				System.out.print("*");	
			System.out.println();
		}
	}

	static void numberPattern(int rows) {
		System.out.println("************* This is the Number Pattern ***************");
		int number = 1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(number++ + " ");
			}
			System.out.println();
		}
	}

	static void binaryPattern(int rows) {
		System.out.println("************* This is the Binary Number Pattern ***************");
		int count = 1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count%2+" ");
				count++;
			}
			if(i%2 == 0)
				count = 1;
			else 
				count = 0;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter no.of rows : ");
		int rows = obj.nextInt();

		starPattern1(rows);
		starPattern2(rows);
		numberPattern(rows);
		binaryPattern(rows);
	}
}