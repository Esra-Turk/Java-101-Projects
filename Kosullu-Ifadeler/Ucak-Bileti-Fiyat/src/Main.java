import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int mesafe, yas, yolculukTipi;
		double fiyat, indirim, indirimliFiyat, gidisDonus;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		mesafe = input.nextInt();
		
		System.out.print("Yaşınızı giriniz: ");
		yas = input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
		yolculukTipi = input.nextInt();
		
		fiyat = mesafe * 0.10; //km başına ücret 0.10 TL'dir
		
		//mesafe ve yaş pozitif yolculuk tipi ise 1 veya 2 olmalıdır koşulu
		if(mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2) )
			System.out.println("\"Hatalı Veri Girdiniz !\" ");
		
		//Yolcuların yaşına göre indirimli fiyatı belirleme
		if(yas < 12) {
			indirim = fiyat * 0.50;
			indirimliFiyat = fiyat - indirim;	
		}
		else if (yas <= 24) {
			indirim = fiyat * 0.10;
			indirimliFiyat = fiyat - indirim;
		}
		else if (yas >= 65) {
			indirim = fiyat * 0.30;
			indirimliFiyat = fiyat - indirim;
		}
		else {
			indirimliFiyat = fiyat;  //24 65 yaş arası müşterilere indirim yok
		}
		
		//bilet çift yön ise yüzde 20 indirim uygulanır.
		if(yolculukTipi == 2) {
			gidisDonus = indirimliFiyat - (indirimliFiyat * 0.20);	
			System.out.println("Gidiş dönüş biletlerinizin fiyatı:" + gidisDonus * 2);
		}
		else if(yolculukTipi == 1){ //bilet tek yönlü ise extra indirim uygulanmaz
			System.out.println("Tek yönlü bilet aldınız.İndirimli Tutar: " +indirimliFiyat);
		}
	}
}
