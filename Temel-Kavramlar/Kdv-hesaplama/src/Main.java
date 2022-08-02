import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double kdvsizFiyat, kdvliFiyat, kdvTutari, kdvYuzdesi; 
		
		Scanner fiyat = new Scanner(System.in);
		System.out.print("Ürünün fiyatını giriniz: ");
		kdvsizFiyat = fiyat.nextDouble();
		
		kdvYuzdesi = (kdvsizFiyat <= 1000)? 0.18 : 0.08; //ürünün fiyatı 1000 TL'den düşükse kdv %18, değilse kdv %8
		kdvTutari = kdvsizFiyat * kdvYuzdesi; //ürünün kdv tutarını hesaplama
		kdvliFiyat = kdvsizFiyat + kdvTutari; //kdvli fiyat hesaplama
		
		System.out.println("Ürünün kdvsiz fiyatı: " +kdvsizFiyat);
		System.out.println("ürünün kdv oranı: " +kdvYuzdesi);
		System.out.println("Ürünün kdvli fiyatı: " + kdvliFiyat);
		System.out.println("Ürünün kdv tutarı:" +(kdvliFiyat - kdvsizFiyat));
			
	}
}
