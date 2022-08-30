import java.util.*;

public class Main {
	static int fibonacci(int number) {
		if(number <= 1) 
			return number;
		
		return fibonacci(number-1) + fibonacci(number-2);
	}
	
	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci serisinin kaçıncı indexi:");
		number = input.nextInt();
		
		System.out.println(fibonacci(number));
	}
}