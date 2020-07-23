class Shifts {

	public static void main(String[] args) {

		int num = 188, result = 0, result1 = 0;
		result = num >>> 4;
		System.out.println(result);

		num = 255;
		result1 = num <<< 3;		//error
		System.out.println(result1);

		num = -108;
		result = num >>>23;
		System.out.println(result);
		
		num = -123;
		result1 = num <<< 15;		//error
		System.out.println(result1);
	}
}

/* operator like unsigned left shift does not exist in java..so it gives error  */
