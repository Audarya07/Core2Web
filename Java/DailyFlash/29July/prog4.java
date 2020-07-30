class Prog4 {
	
	static boolean isDivisible(int dividend, int divisor) {
		if((dividend & ((1 << 1) - 1)) == 0){
			return true;
		}
		else{
			return false;
		}
	}

 	public static void main(String[] args) {
		int dividend = 13;
		int divisor = 2;
		boolean ans;

		System.out.println("Dividend = " + dividend);
		System.out.println("Divisor = " + divisor);

		ans = isDivisible(dividend, divisor);
		if(ans)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}