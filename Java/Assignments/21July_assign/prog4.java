class Examples {

	public static void main(String[] args) {

		int a = 25, b = -34, c = 19, d = 4;
		int res;
		res = (a << 2 | b >> 3);
		//(25 * pow(2,2)) | (-34 / pow(2, 3)) = (100) | (-5) = -1
		//Precedence:1) a << 2
		//	     2) b >> 3
		//	     3) | operation
		
		System.out.println(res);


		boolean result = ((a << 2 | b >> 3) < -10) || ((c++ << 2 & b-- >>> d) >= 23);
		// ((-4) < -10) || ((20 << 2 & -34 >>> 4) >= 23)
		// (false) || ((80 & 268435453) >= 23) = (false) || (80 >= 23) = (false) || (true) ---> true
		System.out.println(result);
	}
}
