import java.io.*;

class Prog1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[];
		System.out.print("Enter the size :");
		int n = Integer.parseInt(br.readLine());
		a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Reverses is :");
		for(int i = n-1; i >= 0; i--){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
