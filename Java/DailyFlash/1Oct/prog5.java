import java.util.*;
import java.io.*;
class Prog5 { 

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the First array size :");
		int n = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Second  array size :");
		int m = Integer.parseInt(br.readLine());
	
		int arr1[] = new int[n];
		int arr2[] = new int[m];

		Arrays.fill(arr2, 0);

		for(int i = 0; i < n; i++){
			arr1[i] = Integer.parseInt(br.readLine());
			if(arr1[i] % 2 == 0){
				arr2[i] = -1;
			}
		}
		System.out.print("First array : ");
		for(int i = 0; i < n; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		
		System.out.print("Second  array : ");
		for(int i = 0; i < m; i++)
			System.out.print(arr2[i] + " ");
		
		System.out.println();
	}
}
