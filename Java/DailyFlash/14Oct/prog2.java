import java.io.*;

class Prog2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of Array: ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int cnt = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] % 2 != 0)
				cnt++;
		}

		System.out.println("Count is :" + cnt);
	}
}
