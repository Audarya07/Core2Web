class Prog2 {
	
	public static void main(String[] args) {
		
		int num = 12345;
		int evenSum = 0;
		int oddMul = 1;
		while(num != 0) {
			int rem = num % 10;
			if(rem % 2 == 0)
				evenSum += rem;
			else
				oddMul *= rem;
			num /= 10;
		}
		System.out.println("Even digit sum = " + evenSum);
		System.out.println("Odd digit multiplication = " + oddMul);

	}
}