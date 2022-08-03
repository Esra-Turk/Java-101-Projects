import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int acilisUcreti = 10; //taksimetre açılış fiyatı
		int minimumTutar = 20; //kısa mesafe ücreti
		
		float toplamFiyat, fiyat, kilometre;
		
		//klavyeden kilometre bilgisi alınır.
		Scanner km = new Scanner(System.in);
		System.out.print("Kaç kilometre gidildi: ");
		kilometre = km.nextFloat();
		
		//fiyat hesabı
		toplamFiyat = (float) (acilisUcreti + kilometre * 2.20);
		fiyat = (toplamFiyat <= 20) ? 20: toplamFiyat;
		
		System.out.println("Kilometre: "  + kilometre);
		System.out.println("Ücretiniz: " +fiyat + "TL");
		
	}
}
