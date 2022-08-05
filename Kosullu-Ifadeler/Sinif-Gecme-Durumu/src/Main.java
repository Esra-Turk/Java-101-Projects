import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int matematik, fizik,kimya, muzik, turkce,toplam = 0;
		double ortalama;
		
		//kullanıcıdan ders notlarının alınması
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		matematik = input.nextInt();
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		System.out.print("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		System.out.print("Müzik notunuzu giriniz:" );
		muzik = input.nextInt();
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = input.nextInt();
		
		//tüm notlar bir diziye eklenir ve dizi üzerinde for döngüsüyle gezilerek notların 0-100 aralığında olup olmadığı kontrol edilir.
		int [] notlar = {matematik,fizik,kimya,muzik,turkce};
		
		for(int i=0; i < 5; i++) {
			if (notlar[i] < 0 || notlar[i] > 100) {
				notlar[i] = 0; //aralığın dışındaki notlar 0 kabul edilir
			}		
		}
		
		//Ortalama hesaplamadan önce tüm notlar toplam değişkenine eklenir
		for (int j= 0; j< 5; j++) {
			toplam += notlar[j];
		}
		
		ortalama= toplam / 5;
		
		if(ortalama >= 55)
			System.out.println("Sınıfı geçtiniz");
		else
			System.out.println("Sınıfta kaldınız.");
			
		System.out.println("Ortalamanız: " + ortalama);
		
	}	
}

