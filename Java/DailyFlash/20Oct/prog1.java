import java.util.Scanner;

class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s1 = sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				cnt++;
		}
		System.out.println("Number of Vowels = " + cnt);
	}
}