import java.util.Scanner;

class Prog3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		StringBuffer sb1 = new StringBuffer(sc.nextLine());

		System.out.println(sb1);
		
		//insert
		System.out.println("After Insert: " + sb1.insert(4,"Girish"));

		//reverse
		System.out.println("After Reverse: " + sb1.reverse());

		sb1.reverse();

		//replace
		System.out.println("After Replace: " + sb1.replace(2, 3, "here"));

		//delete
		System.out.println("After Delete: " + sb1.delete(3,5));

		//charAt
		System.out.println("CharAt(1): " + sb1.charAt(1));

		System.out.println("Substring(5,8): " + sb1.substring(5, 8));		
	}
}