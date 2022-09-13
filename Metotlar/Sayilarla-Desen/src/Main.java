import java.util.*;

public class Main {
	public static void desen(int number,int tempNumber, int x) {
		//x = 0 -> çıkarma işlemi x = 1 -> toplama işlemini temsil eder.
		
		//Adım 1: Sayı pozitifse ve x = 0 ise sayı negatif veya 0 olana kadar 5 azaltılır
		if(number > 0 && x == 0) {
			System.out.print(number + " ");
			number -= 5;
			desen(number,tempNumber,0);
		}
		
		//Adım 2: Sayı 0 veya negatif olduğunda çalışır.x = 1 ile toplama işlemi çağrılır. 
		else if(number == 0 || number < 0) {
			System.out.print(number + " ");
			number += 5;
			desen(number,tempNumber,1);
			}	
		
		//Adım 3: 2.adımda çağrılan toplama işlemi bu koşulda gerçekleşir. 0'dan number'a kadar 5 artırılarak ekrana yazılır.
		else if(number > 0 && number <= tempNumber && x == 1) {
			System.out.print(number + " ");
			number += 5;
			desen(number,tempNumber,1);
		}
	}
			
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("N sayısı: ");
		num = input.nextInt();
		
		desen(num,num,0);
	}
}