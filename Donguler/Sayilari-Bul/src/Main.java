import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sayi, i,ortalama ;
	
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı: ");
		sayi = input.nextInt();
		
		int toplam = 0;
		int adet = 0; 
		
		// Tüm sayıların 0'la modu 0 olduğu için i = 0 dahil değildir
		for(i = 1; i <= sayi; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				adet += 1;
			}
		}
		
		if(adet > 0) {
			ortalama = toplam / adet;
			System.out.println("Sayilarin ortalamasi: "+ortalama);
		}
		else {
			System.out.println(sayi +"'dan küçük 3 ve 4'e bölünebilen bir sayı yoktur.");
		}

	}
}
