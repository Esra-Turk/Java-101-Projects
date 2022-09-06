import java.util.*;

public class Main {
	public static void main(String[] args) {
		int size;
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin boyutunu giriniz: ");
		size = input.nextInt();
		
		System.out.println("Dizinin elemanlarını giriniz:");
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.print((i+1) +". elemanı giriniz: ");
			number = input.nextInt();
			array[i] = number;	
		}
		
		System.out.println("Dizi ilk hali: " + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(array));
	}
}