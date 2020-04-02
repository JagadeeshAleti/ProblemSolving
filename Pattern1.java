import java.util.Scanner;
class Pattern1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter no.of rows : ");
		int rows = obj.nextInt();
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
}