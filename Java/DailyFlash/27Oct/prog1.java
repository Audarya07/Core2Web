import java.util.Scanner;

class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		StringBuffer s = new StringBuffer(sc.nextLine());
		
		System.out.println("After operation 1:");
		System.out.println(s.append("Technologies"));

		System.out.println("After operation 2:");
		System.out.println(s.capacity());

		System.out.println("After operation 3:");
		System.out.println(s.append("Biencaps"));

		System.out.println("After operation 4:");
		System.out.println(s.capacity());		
	}
}