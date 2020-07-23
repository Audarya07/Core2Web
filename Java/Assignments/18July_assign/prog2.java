class Main {

	public static void main(String[] args) {

		int num = 4;

		System.out.println("ans = " + (num >>>= 2));	//num = 4/(pow(2,2)) = 4/4 = 1
		//Now num = 1
		System.out.println("ans = " + (num <<= 3));	//num = 1 * (pow(2,3)) = 1*8 = 8
		//Now num = 8
		System.out.println("ans = " + (num ^= 2));	//num = 8^2 = (1000) ^ (0010) = 1010 = 10 in decimal
		//Now num = 10
		System.out.println("ans = " + (num = ++num));	//num = num + 1 = 10 + 1 = 11
		//Now num = 11
		System.out.println("ans = " + (~num));		// 1011 + 1 = -1100 = -12
	}
}
