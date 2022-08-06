import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int gun, ay;
		String burc = "";
		
		//kullanıcıdan ay gün bilgisi alınır
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doğum ayınız: ");
		ay = input.nextInt();
		
		System.out.print("Doğum gününüz: ");
		gun = input.nextInt();
		
		if(ay >= 1 && ay <=12 && gun >= 1) {
			
			//ay Ocaksa ve gün 1-21 arasında yada aylardan aralık gün 22-31 arasındaysa oğlak burcudur 
			if((ay == 1) && (gun <= 21) || (ay == 12) &&(gun > 22 && gun <= 31)) 
				burc = "oglak"; 
			
			else if ( ((ay == 1) && (gun >21 && gun <= 31)) || ( ay == 2 && gun <= 19 ) )
				burc = "kova";
			
			else if ( ((ay == 2) && (gun > 19 && gun <= 29)) || ( ay ==3 && gun <= 2) )
				burc = "balık";
				
			else if ( ((ay == 3) && (gun > 20 && gun <= 31)) || (ay == 4 && gun <= 20) )
				burc = "koç"; 

			else if( ((ay == 4) &&(gun > 20 && gun <= 30)) || (ay == 5 && gun <= 21) )
				burc = "boğa";
		
			else if ( ((ay == 5) && (gun > 21 && gun <= 31)) || (ay == 6 && gun <= 22) )
				burc = "ikizler";
		
			else if ( ((ay == 6) && (gun > 22 && gun <= 30)) || (ay == 7 && gun <= 22) )
				burc = "yengeç";

			else if( (ay == 7) && (gun > 22 && gun <= 31) || (ay == 8) && (gun <= 22) )
				burc = "aslan";
		
			else if ( (ay == 8) && (gun > 22 && gun <= 31) || (ay == 9 && gun <= 22) ) 
				burc = "başak";
		
			else if ( (ay == 9) && (gun > 22 && gun <= 30) || (ay == 10 && gun <= 22) )
				burc = "terazi";
		
			else if ( (ay == 10) && (gun > 22 && gun <= 31) || (ay == 11 && gun < 22) )
				burc = "akrep";

			else if( (ay == 11) &&(gun >= 22 && gun <= 30) || (ay == 12 &&gun < 22) )
				burc = "yay";
			
			else
				System.out.println("Tarih bulunamadı.Doğum gününüzü 1-31 arasında giriniz.");
		
		}
		
		else 
			System.out.println("Tarih bulunamadı.Doğum ayınızı 1-12 arasında giriniz.");
		
		System.out.println("Burcunuz: "+burc);

	}
}
