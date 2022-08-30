import java.util.Scanner;

public class Main {
	
	static int power(int taban,int us) {
		//üs 1 olduğunda sonuç taban sayıdır
		if(us == 1) 
			return taban;
		
		//üs sıfırsa sonuç 1'dir
		if(us == 0)
			return 1;
	
		return power(taban, us -1) * taban;
	}
	
	public static void main(String[] args) {
		System.out.println("Üslü Sayı Hesaplama Programı\nProgramdan çıkmak istediğinizde 0 giriniz.\n**********************************************");
		
		while(true) {
			int num1, num2, result;
			Scanner input = new Scanner(System.in);
			
			System.out.print("Taban değeri giriniz: ");
			num1 = input.nextInt();
			if(num1 == 0) {
				System.out.println("Programdan çıkılıyor..");
				System.exit(0);
			}
			
			System.out.print("Üs değerini giriniz: ");
			num2 = input.nextInt();
			
			result = power(num1,num2);
			System.out.println("Sonuç: " +result);
			
		}
	}
}
