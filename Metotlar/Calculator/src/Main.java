import java.util.Scanner;

public class Main {
	//Toplama işlemi
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
    
    //Çıkarma işlemi
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }
    
    //Çarpma işlemi
    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    //Bölme İşlemi
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    
    //Üs alma işlemi
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    
    //Faktöriyel hesabı
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    
    //Mod alma işlemi
    static void modding() {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Sayıyı giriniz: ");
    	int num1 = scan.nextInt();
    	System.out.print("Mod değerini giriniz: ");
    	int num2 = scan.nextInt();
    	
    	int result = num1 % num2;
    	System.out.println("Sonuç: "+result);
    
    }
    
    //Dikdörtgen alan ve çevresi hesaplama
    static void rectangular() {
       	Scanner scan = new Scanner(System.in);
    	System.out.print("1. kenar: ");
    	int num1 = scan.nextInt();
    	System.out.print("2.kenar: ");
    	int num2 = scan.nextInt();
    	
    	int perimeter= 2 * (num1+num2);
    	int area = num1 * num2;
    	
    	System.out.println("Dikdörgenin çevresi: " +perimeter);
    	System.out.println("Dikdörtgenin alanı:" +area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        
        System.out.println("Hesap Makinesi\nİşlemler");
        System.out.println(menu);

        while(true) {
        	System.out.println("**********************************");
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                	modding();
                	break;
                case 8:
                	rectangular();
                	break;
                case 0:
                	System.out.println("Hesap makinesi sonlandırıldı");
                	System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
    }
}