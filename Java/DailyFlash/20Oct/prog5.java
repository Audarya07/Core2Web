import java.util.Scanner;

class Prog5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password:");
		String password = sc.nextLine();
		int num = 0;
		int spec = 0;

		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if(ch >= '0' && ch <= '9'){
				num++;
			}
			if(ch == '@' || ch =='#' || ch =='$' || ch =='%'){
				spec++;
			}
		}
		if(num >= 1 && spec >= 1 && password.length() >= 8)
			System.out.println("VALID PASSWORD");
		else
			System.out.println("INVALID PASSWORD");

	}
}