import java.io.*;

class Prog1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose input type:\n1.Integer\n2.String");
		int choice = Integer.parseInt(br.readLine());
		switch(choice) {
			case 1 :
				System.out.println("Enter Integer input:");
				int num = Integer.parseInt(br.readLine());
				System.out.println("User entered = " + num);
				break;
			case 2 :
				System.out.println("Enter String input:");
				String n = br.readLine();
				System.out.println("User entered = " + n);
				break;
			default : System.out.println("Invalid input!!");
		}
	}
}