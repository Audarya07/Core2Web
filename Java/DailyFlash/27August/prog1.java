import java.io.*;

class Prog1{

	public static void main(String[] args) throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());

		System.out.println("Addition is "+(a+b));
		System.out.println("Subtraction  is "+(a>b ? a-b:b-a ));
	}
}
