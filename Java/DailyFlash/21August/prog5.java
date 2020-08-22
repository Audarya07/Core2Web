import java.io.*;

class Prog5 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		char ch = (char)br.read();
		System.out.println("ASCII value of " + ch + " is : " + (int)ch);	
	}
}