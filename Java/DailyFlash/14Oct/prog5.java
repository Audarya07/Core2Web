import java.io.*;

class Prog5 {

	static 	boolean checkMonotonic(int arr[], int n) {
		
		int flag = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++){
				if(arr[i] <= arr[j])
					;
				else {
					flag = 1;
					break;
				}
			}
		}
		if(flag == 1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		boolean ans = Prog5.checkMonotonic(arr, n);
		if(ans == true)
			System.out.println("Array is Monotonic");
		else
			System.out.println("Array is not  Monotonic");
	}
}
