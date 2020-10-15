import java.io.*;

class Prog4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		System.out.print("Enter string array: ");
		for(int i = 0; i < n; i++){
			arr[i] = br.readLine();
		}

		System.out.println("Output : ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				System.out.println(arr[i]);
			}
			System.out.println();
		}
	}
}
