import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float boy, kilo, vki;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Boyunuz(metre): ");
		boy = input.nextFloat();
		
		System.out.print("Kilonuz(kg): ");
		kilo = input.nextFloat();
		
		//vücut kitle indeksi hesaplama
		vki = kilo / (boy * boy); 
		System.out.println("Vücut kitle indeksiniz: " +vki);
		
		
		
		
		
		
	}
}
