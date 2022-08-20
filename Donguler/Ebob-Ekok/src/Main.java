import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number1, number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		number1 = input.nextInt();
		System.out.print("Sayı giriniz: ");
		number2 = input.nextInt();
		
		//iki sayıdan en küçüğünü bul
		int i = (number1 < number2)? number1 : number2;
		
		//EBOB hesaplama
		while(true) {
			if(number1 % i == 0 && number2 % i== 0) {
				System.out.println("En büyük ortak bölen: " +i);
				break;
			}
			i--;
		} 
		
		//EKOK hesaplama
		int k = 1;
		while(k <= number1 * number2) {
			if(k % number1 == 0 && k % number2 == 0) {
				System.out.println("En küçük ortak kat: " +k);
				break;
			}
			k++;
		}
	}
}
