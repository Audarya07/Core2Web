class Bitwise {

	public static void main(String[] args) {

		int int1 = 10, int2 = 20;
		float float1 = 2.3f, float2 = 5.6f;
		long long1 = 11111, long2 = 22222;
		double doub1 = 10.543, doub2 = 12.222;
		char c1 = 'c', c2 = 't';

		System.out.println("For bitwise AND (&):");
		System.out.println(int1 & int2);
		System.out.println(float1 & float2);
		System.out.println(long1 & long2);
		System.out.println(doub1 & doub2);
		System.out.println(c1 & c2);
		
		System.out.println("For bitwise OR (|):");
		System.out.println(int1 | int2);
		System.out.println(float1 | float2);
		System.out.println(long1 | long2);
		System.out.println(doub1 | doub2);
		System.out.println(c1 | c2);
		
		System.out.println("For bitwise XOR (^):");
		System.out.println(int1 ^ int2);
		System.out.println(float1 ^ float2);
		System.out.println(long1 ^ long2);
		System.out.println(doub1 ^ doub2);
		System.out.println(c1 ^ c2);
	}
}


/*
 * Float and double data types does not allow bitwise operation and thus gives error
 */
