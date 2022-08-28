import java.util.*;

public class Main {
	public static void main(String[] args) {
		int sayi;
		int num1 = 0;
		int num2 = 1;
		int toplam;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç elemanlı Fibonacci Serisi istiyorsunuz: ");
		sayi = input.nextInt();
		
		System.out.print(num1+ " ");
		System.out.print(num2+ " ");
		
		for(int i = 1; i < sayi-1; i++) {
			toplam = num1 + num2;
			System.out.print(toplam + " ");
			
			num1 = num2;
			num2 = toplam;	
		}
	}

}
