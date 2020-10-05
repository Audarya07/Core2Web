import java.util.*;

class Prog4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();			
		}
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
		System.out.print("Enter position of insertion: ");
		int pos = sc.nextInt();
		System.out.print("Enter element for insertion: ");
		int num = sc.nextInt();

		int[] arr1 = new int[n+1];
		for (int i = 0; i < n+1; i++) {
			if(i < pos)
				arr1[i] = arr[i];
			else if(i == pos)
				arr1[i] = num;
			else
				arr1[i] = arr[i - 1];
		}

		System.out.println("Output: ");
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j] + " ");
		}
		System.out.println();
	}
}