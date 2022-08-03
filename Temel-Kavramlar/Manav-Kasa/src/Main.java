import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double armut, elma, domates, muz, patlican,toplamTutar;
		
		//meyve fiyatları
		double armutFiyat = 2.14;
		double elmaFiyat = 3.67;
		double domatesFiyat = 1.11;
		double muzFiyat = 0.95;
		double patlicanFiyat = 5;
		
		//kullanıcıdan kilogram bilgilerini alma
		Scanner kilogram = new Scanner(System.in);
		
		System.out.print("Armut kaç kilo? :");
		armut = kilogram.nextDouble();
		
		System.out.print("Elma kaç kilo? :");
		elma = kilogram.nextDouble();
		
		System.out.print("Domates kaç kilo? :");
		domates = kilogram.nextDouble();
		
		System.out.print("Muz kaç kilo? :");
		muz = kilogram.nextDouble();
		
		System.out.print("Patlıcan kaç kilo? :");
		patlican = kilogram.nextDouble();
		
		//Alıvşeriş toplam fiyatı hesaplama
		toplamTutar = armut * armutFiyat + elma * elmaFiyat + domates * domatesFiyat + muz * muzFiyat + patlican * patlicanFiyat;
		System.out.println("Toplam Tutar: "+toplamTutar + "TL");
	}
}
