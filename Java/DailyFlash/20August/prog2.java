import java.io.*;

class Prog2 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter principal amount : ");
		int p = Integer.parseInt(br.readLine());

		System.out.println("Enter rate : ");
		float r = Float.parseFloat(br.readLine());

		System.out.println("Enter time : ");
		int t = Integer.parseInt(br.readLine());

		float si = p * (float)(r/100) * t;
		System.out.println("Simple interest = " + si);
	}
}