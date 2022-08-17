import java.util.*;

public class Main {
	public static void main(String[] args) {
		int number;
		int value;
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		number = input.nextInt();
		
		int tempNumber = number;
		while(tempNumber != 0) {
			value = tempNumber % 10;
			result += value;
			tempNumber /= 10;	
		}
		
		System.out.println(number + " sayısının rakamları toplamı: " +result);
	}
}
