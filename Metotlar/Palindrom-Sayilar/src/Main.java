import java.util.Scanner;

public class Main {
	static void isReverse(int number) {
	    int ters = 0;
	    int temp = number;
	    while (temp != 0) {
	        ters *= 10;
	        ters += temp % 10;
	        temp /= 10;
	    }
	    
	    if(ters == number)
	    	System.out.println(number + " Palindrom sayıdır");
	    else
	    	System.out.println(number + " Palindrom sayı değildir");
	}
	
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı giriniz:");
		num = input.nextInt();
		
		isReverse(num);
	}
}
