import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak sayısını giriniz: ");
		number = input.nextInt();
		
		for(int i=1; i <= number; i++) {
			for(int j = 1 ; j <= i-1 ; j++) {
				System.out.print(" ");
			}
			
			for(int k= 1; k <= 2 *(number - i) + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
