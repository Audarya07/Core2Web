import java.io.*;

class Prog5 {

	public static void main(String[] args) throws IOException{
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a + b;
		System.out.println("The sum of " + args[0] + " and " + args[1] +" is = " + sum);
	}
}