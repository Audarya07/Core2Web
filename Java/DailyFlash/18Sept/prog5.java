import java.io.*;

class Prog5 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		for (int i = a; i <= b; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact *= j;	
			}
			System.out.println("Factorial of " + i + " is = " + fact);
		}
	}
}