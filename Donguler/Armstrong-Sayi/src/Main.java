import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		int digitNumber = 0; //basamak sayısı
		int result = 0; //toplama işlemi için değişken
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		number = input.nextInt();
		
		int tempNumber = number; //sayının ilk değerini korumak için geçici değişken oluşturuldu
		while(tempNumber != 0) {
			tempNumber /= 10;
			digitNumber++;	
		}
		
		tempNumber = number;
		while(tempNumber != 0) {
			int value = tempNumber % 10; //sayının birler basamağındaki rakamı hesaplar.
			result += Math.pow(value, digitNumber);
			tempNumber /= 10;	
		}
		
		if(result == number) {
			System.out.println(number+ " Armstrong sayıdır");
		}
		else {
			System.out.println(number+ " Armstrong sayı değildir");
		}
	}
}
