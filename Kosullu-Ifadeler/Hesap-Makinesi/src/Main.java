import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double sayi1, sayi2, sonuc;
		String secim;
		
		Scanner input = new Scanner(System.in);
		System.out.print("1.sayıyı giriniz: ");
		sayi1= input.nextDouble();
		System.out.print("2.sayıyı giriniz: ");
		sayi2 = input.nextDouble();
		
		System.out.print("Yapmak istediğiniz işlemi giriniz: ");
		secim = input.next();
		
		switch(secim) {
			case("toplama"):
				System.out.println("Sonuc: " +(sayi1 + sayi2));
				break;
			case("çıkarma"):
				System.out.println("Sonuc: "+ (sayi1 - sayi2));
				break;
			case("çarpma"):
				System.out.println("Sonuc: "+ (sayi1 * sayi2));
				break;
			case("bölme"):
				if (sayi2 != 0) {
					System.out.println("Sonuc: "+ (sayi1 /sayi2));
				}
				else {
				System.out.println("Sıfıra bölünme hatası.Tekrar deneyiniz.");
				}
				break;
			default:
				System.out.println("Lütfen geçerli işlem giriniz\nİşlemler\n1.toplama\n2.çıkarma\n3.çarpma\n4.bölme");
		}		
	}
}
