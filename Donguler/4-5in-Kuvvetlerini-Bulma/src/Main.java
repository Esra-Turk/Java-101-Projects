import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num, i;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		num = input.nextInt();
		
		System.out.println(num +"'den küçük 4'ün kuvvetleri");
		for(i = 1; i <= num; i *= 4) {
			System.out.println(i);
		}
		
		System.out.println(num + "'den küçük 5'in kuvvetleri ");
		for(i = 1; i <= num; i *= 5) {
			System.out.println(i);
		}
	}

}
