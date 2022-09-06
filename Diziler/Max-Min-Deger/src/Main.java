import java.util.*;

public class Main {
	public static void main(String[] args) {
		int number;
		int[] array = {15,12,788,1,-1,-778,2,0};
		System.out.println("Dizi:" +Arrays.toString(array));
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz:");
		number = input.nextInt();
		
		//önce dizi sıralanır
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > number) {
				System.out.println("Girilen sayıdan küçük en yakın sayı: " + array[i-1]);
				break;
			}
		}
		
		for(int j = 0; j <  array.length; j++) {
			if(array[j] > number) {
				System.out.println("Girilen sayıdan büyük en yakın sayı: " + array[j]);
				break;	
			}
		}	
	}
}
