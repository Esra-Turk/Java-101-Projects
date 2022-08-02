import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Hipotenüs uzunluğunu bulma
		
		double a, b, c; //dik üçgenin kenarları
		
		Scanner kenar = new Scanner(System.in);
		
		System.out.print("1.dik kenar: ");
		a = kenar.nextDouble();
		System.out.print("2.dik kenar: ");
		b = kenar.nextDouble();
		
		c = Math.sqrt(a*a + b*b); //hipotenüs dik kenarların kareleri toplamının kareköküne eşittir.Math.sqrt karekök alma fonksiyonudur
		System.out.println("Hipotenüs uzunluğu: "+c);
		
		//3 kenarı verilen üçgenin alanını bulma
		
		double u, cevre;
		cevre = a + b + c;
		u = cevre / 2;
		
		double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)); //üçgen alan hesabı
		System.out.println("Üçgenin alanı: " +alan);			
		
	}
}
