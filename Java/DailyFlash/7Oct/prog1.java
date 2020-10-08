import java.util.*;

class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		
		System.out.println("No. of cols for row 1: ");
		int a = sc.nextInt();

		System.out.println("No. of cols for row 2: ");
		int b = sc.nextInt();

		System.out.println("No. of cols for row 3: ");
		int c = sc.nextInt();

		arr[0] = new int[a];
		arr[1] = new int[b];
		arr[2] = new int[c];
		
		System.out.println("Enter elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}