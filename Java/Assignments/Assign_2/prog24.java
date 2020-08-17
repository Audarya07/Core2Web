class Prog24 {

	public static void main(String[] args) {
		
		int num = 3454, rem, count = 0, val = num;
		while(num != 0) {
			rem = num % 10;
			num /= 10;
			count += 1;
		}
		System.out.println("Number of digits in " + val + " is = " + count);
	}
}