import java.io.*;

class Prog4 {

	public static void main(String[] args)throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter the First Number : ");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the Second Number : ");
		int b=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the sign of Operation : ");
		char ch=(char)br.read();
		
		switch(ch){
			case '+':
				System.out.println("Addition of" + a +"  and "+ b + " is " +(a+b));
				break;
			case '-':
				System.out.println("subtraction of" + a +"  and "+ b + " is " +(a>b ?a-b : b-a));
				break;
			case '*':
				System.out.println("Multiplication  of" + a +"  and "+ b + " is " +(a*b));
				break;
			case '/':
				System.out.println("division  of" + a +"  and "+ b + " is " +(a>b ?a/b : b/a));
				break;
		}
	}
}
