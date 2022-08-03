import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float PI = 3.14f;
		float cevre, alan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yarıçapı: " );
		double yaricap = input.nextDouble();
		
		System.out.print("Dairenin merkez açıcı ölçüsü: ");
		int aci = input.nextInt();
		
		cevre = (float) (2 * PI * yaricap); //dairenin çevresini hesaplama
		alan = (float) (PI * (yaricap * yaricap ) * aci) / 360; //daire diliminin alanını hesaplama
		
		System.out.println("Dairenin çevresi: " +cevre);
		System.out.println("Dairenin alanı: " +alan);

		
		
		
		
		
		
	}

}