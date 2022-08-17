import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userName, password;
		int right = 3; //sisteme giriş hakkı
		int secim = 0; //işlemler için değişken tanımlama
		int balance = 5500; //bakiye
		
		Scanner input = new Scanner(System.in);
		
		while(right != 0) {
			System.out.print("Kullanıcı adınızı giriniz: ");
			userName = input.nextLine();
			
			System.out.print("Şifrenizi giriniz: ");
			password = input.nextLine();
		
			if(userName.equals("Esra-Turk") && password.equals("12345")) {
				System.out.println("***************************************");
				System.out.println("Garanti Bankasına giriş yapıldı");
				System.out.println("İŞLEMLER\n1.Para Yatırma\n2.Para Çekme\n3.Bakiye Sorgulama\n4.Çıkış yapma");
				System.out.println("***************************************");
				
				while(true) {
					System.out.print("\n");
					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
					
					secim = input.nextInt();
					switch(secim) {
						case 1:
							System.out.print("Yatırmak istediğiniz para miktarı: ");
							int money = input.nextInt();
							balance += money;
							break;
						
						case 2:
							System.out.print("Çekmek istediğiniz para miktarı: ");
							int money2 = input.nextInt();
							if(money2 > balance) {
								System.out.println("Yetersiz Bakiye");
							}
							else {
								balance -= money2;
							}
							break;
						
						case 3:
							System.out.println("Hesabınızdaki para miktarı: " +balance);
							break;	
						
						case 4:
							System.out.println("Çıkış yapılıyor..");
							System.exit(0);
						default:
							System.out.println("Lütfen 1-4 arasında işlem giriniz.");
							break;
					}
				}
			}
			else {
				right--;
				System.out.println("Hatalı giriş tekrar deneyiniz.Tekrar deneme hakkınız: " +right);
			}
		}
		System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");	
	}
}
