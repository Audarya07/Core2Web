class Prog2 {

	public static void main(String[] args) {
		
		int i, a = 10, b = 15, gcd = 1;
		for (i = 1; i <= a && i <= b; i++) {

			if(a % i == 0 && b % i == 0)
				gcd = i;
		}		
		System.out.println("GCD of " + a + " and " + b + " is = " + gcd);
	}
}