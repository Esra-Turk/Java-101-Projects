import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int howMany;
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kaç tane sayı gireceksiniz: ");
		howMany = input.nextInt();
		
		int index = 0;
		int dizi[] = new int[howMany];
		
		for(int i = 1; i <= howMany; i++) {
			System.out.print(i+ ". Sayıyı giriniz: ");
			number = input.nextInt();
			
			dizi[index] = number;
			index++;
		}
		
        	int large = dizi[0];
        	int least = dizi[0];
        	for (int i = 0; i < dizi.length; i++){
            	if (dizi[i] >large) 
                	large = dizi[i];
            
            	if(dizi[i] < least)
            		least = dizi[i];   
        	}
        	System.out.println("Dizideki en büyük değer: " + large);
        	System.out.println("Dizideki en küçük değer: " + least);
	}
}
