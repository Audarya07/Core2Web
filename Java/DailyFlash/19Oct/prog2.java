import java.util.Scanner;

class Prog2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Result array:");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}