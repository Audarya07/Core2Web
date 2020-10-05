import java.util.*;

class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n]; 
		System.out.println("Enter elements in array 1: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter elements in array 2: ");
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr3[i] = arr1[i] * arr2[i];
		}

		System.out.println("After operation elements in third array: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr3[i] + " ");
		}		

	}
}