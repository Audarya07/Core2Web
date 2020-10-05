import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the size :");
		int n=Integer.parseInt(br.readLine());

		int[] a = new int[n];
		int max=0;
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(br.readLine());
			if(max < a[i])
				max = a[i];
		}
		System.out.println("Maximum Element is :" + max);
	}
}
