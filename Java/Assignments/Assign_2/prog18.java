class Prog18 {

	public static void main(String[] args) {
		
		int num = 423, rem, rev = 0;
		while(num != 0) {
			rem = num %10;
			num /= 10;
			rev = rev*10 + rem;
		}
		System.out.println("Reversed number = " + rev);
	}
}