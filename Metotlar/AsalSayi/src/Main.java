import java.util.Scanner;

public class Main {
    static boolean isPrime(int num, int diviser) {
        if(num < 2) {
            return false;
        }

        if(diviser == 1) {
            return true;
        }

        if(num % diviser == 0) {
            return false;
        }

        return isPrime(num, diviser-1);
    }

    public static void main(String[] args) {
        int number;
        boolean primeNumber;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        number = scan.nextInt();

        primeNumber = isPrime(number, number/2);
        if(primeNumber == true) {
            System.out.println(number + " asal sayidir.");
        }
        else {
            System.out.println(number + " asal sayi degildir.");
        }
    }
}
