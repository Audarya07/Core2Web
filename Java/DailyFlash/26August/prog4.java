import java.io.*;

class Prog4 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a = Integer.parseInt(br.readLine());
		for (int i = 1; i <= 10; i++) {
			System.out.print(a*i + " ");
		}
		System.out.println();
	}
}