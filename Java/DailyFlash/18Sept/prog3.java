import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= 50; i += n) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}