class Prog4 {

	public static void main(String[] args) {
		
		int val = 10;
		for (int num = 1; num <= val; num++) {
			int fact = 1;
			for (int i = 1; i<= num; i++) {
				fact *= i;
			}
			System.out.println("Factorial of " + num + " = " + fact);
		}
	}
}