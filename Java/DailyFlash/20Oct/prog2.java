import java.util.Scanner;

class Prog2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter original string:");
		String orig = sc.nextLine();
		
		System.out.println("Enter substring:");
		String sub = sc.nextLine();

		if(orig.contains(sub))
			System.out.println(sub + " is present in " + orig);
		else
			System.out.println(sub + " is NOT present in " + orig);
	}
}