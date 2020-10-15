import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int first = arr[0];
		for(int i = 1;i < n; i++){
			if(arr[i] != (first+1)){
				System.out.println("Missing is :" + (first+1));
				break;
			}
			else
				first = arr[i];
		}
	}
}
