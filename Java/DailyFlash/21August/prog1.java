import java.io.*;
class Prog1 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter radius : ");
		int r = Integer.parseInt(br.readLine());
		System.out.println("Area of cicle : " + (float)(3.14 * r * r));

	}
}