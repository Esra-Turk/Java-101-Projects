import java.util.Arrays;

public class Main {
	public static void isPairArray(int [] arr){
		System.out.print("En çok tekrar eden sayilar: ");
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j] && arr[j] % 2 == 0){
					System.out.print(arr[j] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] list = {0,5,0,9,3,4,7,8,5,2,6,4,2,9,8,5,3,1,7,6,3};
		isPairArray(list);
	}
}
