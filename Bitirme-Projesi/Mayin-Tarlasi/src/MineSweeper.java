import java.util.*;

class Response {
	int row, column;
	String str;
	
	Response(int row, int column, String str) {
		this.row = row;
		this.column = column;
		this.str = str;
	}
	
	Response(String str) {
		this.row = -2;
		this.column = -2;
		this.str = str;
	}
}

public class MineSweeper{
	int row, column;
	int numberOfCorrects;
	int numberOfMines;
	String array[][];
	String arrayOfMines[][];
	Random rand;
	Scanner input;
	
	public MineSweeper(int row, int column) {
		this.row = row;
		this.column = column;
		this.numberOfCorrects = 0;
		this.array =  new String[row][column];
		this.arrayOfMines = new String[row][column];
		this.numberOfMines = (row * column) / 4;
		this.rand = new Random();
		this.input = new Scanner(System.in);
	}
	
	public void generateRandomPosition() {
		int randomRow = rand.nextInt(row), randomColumn = rand.nextInt(column);
		
		while(this.array[randomRow][randomColumn] == "*") {
			randomRow = rand.nextInt(row);
			randomColumn = rand.nextInt(column);
		}
		
		array[randomRow][randomColumn] = "-";
		arrayOfMines[randomRow][randomColumn] = "*";
	}
	
	public void createArray() {
		for(int i= 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = "-";
			}
		}
	}
	
	public void createMine() {
		for(int i=0; i < numberOfMines ; i++) {
			generateRandomPosition();
		}
	}
	
	public void printArray() {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=============================");
	}
	
	public boolean checkPosition(String position) {
			return position != null && position == "*";
	}
	
	public void game() {
		while(true) {
			Response res = scanner();
			
			String str = res.str;
			int i = res.row, j = res.column;
			
			if(i == -2 && j == -2) {
				System.out.println(str);
				continue;
			}
			
			if(str == "*") {
				System.out.println("Game over!!");
				break;
			}
			else {	
				int number = 0;
				
				String topLeft = i > 0 && j > 0 ? arrayOfMines[i-1][j-1] : null;
				String top = i > 0 && j > -1 ? arrayOfMines[i-1][j] : null;
				String topRight = i > 0 && j > -1 && j < this.column - 1 ? arrayOfMines[i-1][j+1] : null;
				String left = i > -1 && j > 0 ? arrayOfMines[i][j-1] : null;
				String right = i > -1 && j > -1 && j < this.column - 1 ? arrayOfMines[i][j+1] : null;
				String bottomLeft = i > -1 && j > 0 && i < this.row - 1 ? arrayOfMines[i+1][j-1] : null;
				String bottom = i > -1 && j > -1 && i < this.row - 1 ? arrayOfMines[i+1][j] : null;
				String bottomRight = i > -1 && j > -1 && i < this.row - 1 && j < this.column - 1 ? arrayOfMines[i+1][j+1] : null;
				
				if(checkPosition(topLeft)) {
					number++;
				}
			
				if(checkPosition(top)) {
					number++;
				}
					
				if(checkPosition(topRight)) {
					number++;
				}
					
				if(checkPosition(left)) {
					number++;
				}
					
				if(checkPosition(right)) {
					number++;
				}
					
				if(checkPosition(bottomLeft)) {
					number++;
				}
					
				if(checkPosition(bottom)) {
					number++;
				}
					
				if(checkPosition(bottomRight)) {
					number++;
				}
					
				array[i][j] = Integer.toString(number);
			}
			
			printArray();
			numberOfCorrects++;
			
			if((this.row * this.column) - numberOfMines == numberOfCorrects) {
				System.out.println("You won!!");
				break;
			}
		}
	}
	
	public Response scanner() {
		System.out.print("Satır giriniz: ");
		int row = input.nextInt();
		System.out.print("Sütun giriniz: ");
		int column = input.nextInt();
		
		if(row < this.row && column < this.column) {
			return new Response(row, column, arrayOfMines[row][column]);
		}
		else {
			return new Response("Seçilen nokta dizi sınırları içinde değildir. Lütfen tekrar deneyiniz!");
		}
	}
	
	public void run() {
		System.out.println("\nMayın tarlası oyununa hoşgeldiniz!\n");
		createArray();
		System.out.println("Mayınların konumu");
		createMine();
		printArray();
		game();
	}		
}