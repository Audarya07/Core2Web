import java.util.*;

class Prog4 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[5];

		Scanner sc = new Scanner(System.in);

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

		System.out.print("Even numbers : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % 2 == 0)
					System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
	}
}