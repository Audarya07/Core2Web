import java.io.*;

class Prog3{
	public static void main(String[] args) throws IOException {

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());

		int cube1=a*a*a;
		int cube2=b*b*b;

		int square1=a*a;
		int square2=b*b;
		
		System.out.println("Addition of  "+cube1+" & "+cube2+ " is "+(cube1+cube2));
		System.out.println("Substraction  of  "+square1 +" & "+square2+ " is "+(square1-square2));
	}
}
