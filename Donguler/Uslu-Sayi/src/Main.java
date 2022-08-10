import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num, pow;
		int total = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban sayıyı giriniz:");
		num = input.nextInt();
		
		System.out.print("Üs giriniz: ");
		pow = input.nextInt();
		
		//Üs pozitifse yapılacaklar
		if(pow >= 0) {
			for(int i = 1; i<= pow; i++) {
				total *= num;
			}
			
			System.out.println("Sonuç: " +total);
		}
		//Üs negatifse yapılacaklar
		else {
			for(int i= 1; i<=-(pow); i++) {
				total *= num;
			}
		
			System.out.println("Sonuc:1/" +total);
		}
	}
}
