import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, sayi, total = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Faktöriyeli alınacak sayı: ");
		sayi = input.nextInt();
		
		if(sayi < 0) {
			System.out.println("Negatif sayıların faktöriyeli yoktur");
			System.exit(0);
		}
		
		for(i = 1; i <= sayi; i++) {
			total *= i;
		}
		
		System.out.println(total);
	}
}
