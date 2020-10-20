import java.util.Scanner;

class Prog3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to toggle the case:");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				ch = (char)((int)ch + 32);
			else if(ch >= 'a' && ch <= 'z')
				ch = (char)((int)ch - 32);
			sb.append(ch);
		}
		System.out.println("Toggled string: " + sb);

	}
}