import java.util.*;

class Prog2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter number of cols: ");
		int c = sc.nextInt();

		int arr[][] = new int[r][c];
		int sum = 0;
		int max = -1;
		System.out.println("Enter the elements: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] % 2 == 0)
					sum += arr[i][j];
				if(arr[i][j] > max && arr[i][j] % 2 != 0)
					max = arr[i][j];
			}
		}
		System.out.println("Sum of even elements: " + sum);
		System.out.println("Max odd element: " + max);
		System.out.println("Output: " + (sum * max));
	}
}