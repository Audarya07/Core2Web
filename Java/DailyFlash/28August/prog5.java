import java.io.*;

class Prog5 {

	public static void main(String args[]) throws IOException{

		InputStreamReader inr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inr);
		
		System.out.println("Enter a number :");
		int num = Integer.parseInt(br.readLine());
		int fac = 1;
		for(int i=1;i<=num;i++) {

			fac*=i;
		}
		System.out.println("The Factorial of "+num+" is "+fac);
	}
}
