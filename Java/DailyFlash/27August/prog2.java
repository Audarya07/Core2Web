import java.io.*;

class Prog2{
	public static void main(String[] args) throws IOException {

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		
		System.out.println("Multiplication  is: "+(a*b));
		System.out.println("Division  is: "+(a>b ? a/b:b/a ));
	}
}
