import java.io.*;

class Prog2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		for (int i = start; i <= end; i++) {
			System.out.print((i*i) + " ");
		}
		System.out.println();
	}
}