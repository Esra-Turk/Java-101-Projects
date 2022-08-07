import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int yil;
		boolean artikYil;
		
		//kullanıcıdan yıl bilgisi alınır
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl giriniz:");
		yil = input.nextInt();
		
		//Artık yıl olma koşulları
		//yil = 1800 durumunda
		//if(true && false) || false --> false döner, artık yıl değildir
		if((yil % 4 == 0 && yil %100 != 0) || yil % 400 == 0) {
			artikYil = true;
		}
		else {
			artikYil = false;
		}
		
		//Artık yılsa yapılacaklar
		if(artikYil == true)
			System.out.println(yil + " bir artık yıldır!");
		else
			System.out.println(yil + " bir artık yıl değildir!");
			
	}
}
