import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float boy, kilo, vki;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
		boy = input.nextFloat();
		
		System.out.print("Lütfen kilonuzu(kg) giriniz: ");
		kilo = input.nextFloat();
		
		//vücut kitle indeksi hesaplama
		vki = kilo / (boy * boy); 
		System.out.println("Vücut Kitle İndeksiniz: " +vki);
		
		
		
		
		
		
	}
}
