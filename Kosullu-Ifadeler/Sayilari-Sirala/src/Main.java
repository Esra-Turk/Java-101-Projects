import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double a,b,c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.sayı: ");
		a = input.nextDouble();
		
		System.out.print("2.sayı: ");
		b = input.nextDouble();
		
		System.out.println("3.sayı: ");
		c = input.nextDouble();

		if ((a < b) && (a < c)){
			if (b<c)
			   System.out.println("Küçükten büyüğe: " + a + " < " + b + " < " + c);
			else
			    System.out.println("Küçükten büyüğe: " + a + " < " + c + " < " + b) ;
		}
		
		else if ((b < a) && (b < c)){
			 if (a<c)
			     System.out.println("Küçükten büyüğe: " + b + " < " + a + " < " + c);
			 else
			     System.out.println("Küçükten büyüğe: " + b + " < " + c + " < " + a);
		}
		
		else{
			if (a<b)	
				System.out.println("Küçükten büyüğe: " + c + " < " + a + " < " + b );
			else
			   System.out.println("Küçükten büyüğe: " + c + " < " + b + " < " + a);    
		}
	}
}
