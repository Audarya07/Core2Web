import java.util.Scanner;

class Prog4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		int i = 0, flag = 0;
		int j = s.length() - 1;
		while(i < j){
			if(s.charAt(i) == s.charAt(j)){
				flag = 1;
				i++;
				j--;
			}
			else
				break;
		}
		if(flag == 0)
			System.out.println("Not a palindrome");
		else
			System.out.println("It is a palindrome");
	}
}