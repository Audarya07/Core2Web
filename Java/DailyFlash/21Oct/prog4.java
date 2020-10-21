import java.util.Scanner;

class Prog4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String s1 = sc.nextLine();

		System.out.println("Enter String 2:");
		String s2 = sc.nextLine();
		System.out.println("Is  string 1 equal to sring 2 ? --> " + s1.equals(s2));
	}
}