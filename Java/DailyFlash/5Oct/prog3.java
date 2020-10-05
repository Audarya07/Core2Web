import java.util.*;

class Prog3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter number of cols: ");
		int c = sc.nextInt();

		int arr1[][] = new int[r][c];
		int arr2[][] = new int[r][c];
		int arr3[][] = new int[r][c];
		
		System.out.println("Enter the elements in arr 1: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the elements in arr 2: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		System.out.println("Output: The third matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}