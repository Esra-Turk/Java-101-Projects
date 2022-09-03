import java.util.*;

public class Main {
	static void desen(int number) {
		int temp = number;
		System.out.print(temp + " ");
		
		if(temp <= 0) {
			do {
				temp += 5;
			}while(temp == number);
		}
		else {
			temp -= 5;
			
		}
		
		desen(temp);
}
		
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("N Sayısı: ");
		num = input.nextInt();
		desen(num);
	}
}
