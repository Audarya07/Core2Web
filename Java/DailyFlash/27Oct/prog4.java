import java.util.Scanner;

class Prog4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String with spaces: ");
		StringBuffer sb1 = new StringBuffer(sc.nextLine());
		StringBuffer ans = new StringBuffer();

		for (int i = 0; i < sb1.length(); i++) {
			if(sb1.charAt(i) != ' '){
				ans.append(sb1.charAt(i));
			}
		}
		System.out.println("Result: " + ans);

	}
}