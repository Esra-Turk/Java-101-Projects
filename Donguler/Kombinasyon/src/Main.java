import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, r; //n elemanlı dizinin r elemanlı alt küme sayısı hesaplamak için değişkenler
		int combination;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Eleman sayısı(n):");
		n = input.nextInt();
		System.out.print("Alt kümenin eleman sayısı(r): ");
		r = input.nextInt();
		
		if(n < 0 || r < 0) {
			System.out.println("Hatalı giriş, negatif sayıların faktöriyeli yoktur.Tekrar deneyiniz.");
			System.exit(0);
		}
		
		//n! faktöriyel
		int total = 1;
		for(int i= 1; i<=n; i++) {
			total *= i;	
		}
		
		// r! faktöriyel
		int total2 = 1;
		for(int i= 1; i<=r; i++) {
			total2 *= i;
		}
		
		// (n-r)! faktöriyel
		int total3 = 1;
		for(int i=1; i <= n- r; i++) {
			total3 *= i;	
		}
		
		//Kombinasyon formülü
		//C(n,r) = n! / (r! * (n-r)!)
		combination = total / (total2 * total3);	
		System.out.println(n +" sayısının " +r + "'li kombinasyonu: " +combination);
	}
}
