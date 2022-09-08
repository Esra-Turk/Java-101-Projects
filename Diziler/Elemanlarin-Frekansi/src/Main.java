import java.util.Arrays;

public class Main{
	public static void frekans(int arr[], int n) {
		boolean array[] = new boolean[n];
		Arrays.fill(array, false);

		for (int i = 0; i < n; i++) {
			if (array[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
				array[j] = true;
				count++;
			}
		}
		
			System.out.println(arr[i] + " sayısı " + count + " kere tekrar edilmiştir.");
	}
}

	public static void main(String []args) {
		int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
		System.out.println("Dizi: " + Arrays.toString(arr) + "\nTekrar Sayıları");
		int n = arr.length;
		frekans(arr, n);
	}
}