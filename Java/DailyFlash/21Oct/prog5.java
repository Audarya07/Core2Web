import java.util.Scanner;

class Prog5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String s1 = sc.nextLine();

		System.out.println("Enter String 2:");
		String s2 = sc.nextLine();
		System.out.println("Is  reference of s1 equal to s2 ? --> " + (s1 == s2));
	}
}