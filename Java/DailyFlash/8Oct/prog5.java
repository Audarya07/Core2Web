import java.util.*;

class Prog5 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[5];
		int sum = 0;
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

		System.out.print("Sum: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % 5 == 0)
					sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}