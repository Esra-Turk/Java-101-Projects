import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		double sicaklik;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Hava sıcaklığını giriniz:");
		sicaklik = input.nextDouble();
		
		if(sicaklik < 5)
			System.out.println("Kayak yapabilirsiniz");
		else if(sicaklik <= 10)
			System.out.println("Sinemaya gidebilirsiniz");
		else if(sicaklik <= 15)
			System.out.println("Sinemaya ve pikniğe gidebilirsiniz");
		else if(sicaklik <=25)
			System.out.println("Pikniğe gidebilirsiniz");
		else
			System.out.println("Yüzmeye gidebilirsiniz");
	}
}
