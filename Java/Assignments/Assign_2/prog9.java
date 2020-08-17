class Prog9 {

	public static void main(String[] args) {
		
		int num = 12241, rev = 0, check = num,rem;
		while(num != 0){
			rem = num % 10;
			rev = rev*10 + rem;
			num /= 10; 
		}
		if(check == rev)
			System.out.println(check + " is a palindrome");
		else
			System.out.println(check + " is NOT aplindrome");
	}
}