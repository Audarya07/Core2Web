class Prog3 {

	public static void main(String[] args) {
		
		long num = 345669760562L, val = 6;
		long num2 = num, rem;
		int count = 0;
		while(num != 0) {
			rem = num % 10;
			num /= 10;
			if(rem == val)
				count += 1;
		}
		System.out.println("The occurrences of " + val + " in " + num2 + " = " + count);
	}
}