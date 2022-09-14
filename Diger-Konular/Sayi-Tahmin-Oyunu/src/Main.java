import java.util.*;

public class Main {
	public static void tahmin(int number ,int randomNumber, int adımSayisi){
	    if(number > 0 && number <= 100){
	    	if(number == randomNumber) {
	    		System.out.println("Tebrikler...Doğru Cevap " + adımSayisi + ". tahmin hakkınızda bildiniz.");
	    		System.exit(0);
			}
			else if(number < randomNumber) {
				System.out.println("Daha büyük bir sayı giriniz.");
			}
		    else if(number > randomNumber) {
		    	System.out.println("Daha küçük bir sayı giriniz.");
			}
	    }
	    else {
	    	System.out.println("Lütfen 1-100 arasında sayı giriniz");
	    	
	    }
	}   
	  
	public static void main(String[] args) {
		int number, randomNumber;
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		randomNumber = random.nextInt(100);
		System.out.println(randomNumber);
		
		//tahmin hakkı 5, döngü 5 kere çalışır
		for(int i = 1; i <=5; i++) {
			System.out.print("Sayı giriniz: ");
			number = scan.nextInt();
			
			if(5 - i > 0) {
				tahmin(number, randomNumber,i);
				System.out.println("Tahmin hakkınız: "+ (5 - i));
				System.out.println("******************************");
			}
			else {
				if(number == randomNumber) {
					tahmin(number,randomNumber,i);
				}
				else {
				System.out.println("Oyun bitti.Hakkınız kalmadı.");
				System.out.println("Tahmin etmeye çalıştığınız sayı " + randomNumber + " idi");
				}
			}
		}
	}	
}