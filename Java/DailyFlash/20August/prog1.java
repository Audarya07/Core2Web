import java.io.*;

class Prog1 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr=  new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Side 1 = ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Side 2 = ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Hypotenuse = ");
		int c = Integer.parseInt(br.readLine());
		if((a*a + b*b) == c*c)
			System.out.println("Triangle satisfies pythagoras theorem");
		else
			System.out.println("Triangle DOES NOT satisfies pythagoras theorem");


	}
}