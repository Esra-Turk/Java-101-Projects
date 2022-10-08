import java.util.*;

public class Main {
	public static void main(String[] args) {
		int rowNumber, columnNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("Mayın tarlası satır sayısını giriniz: ");
		rowNumber = input.nextInt();
		System.out.print("Mayın tarlası sütun sayısını giriniz: ");
		columnNumber = input.nextInt();
		
		if(rowNumber > 1 && columnNumber > 1 ) {
			MineSweeper mine = new MineSweeper(rowNumber, columnNumber);
			mine.run();	
		}
		else {
			System.out.println("Geçersiz satır sütun sayısı girdiniz.");
		}

	}
}
