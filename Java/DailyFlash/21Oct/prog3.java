import java.util.Scanner;

class Prog3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		if(s.length() > 5)
			System.out.println("Ans:" + s);
		else
			System.out.println("Will NOT print!!");
	}
}