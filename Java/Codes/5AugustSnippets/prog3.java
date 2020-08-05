class Prog3 {

	public static void leftshift(int var1, int var2) {
		
		var1 <<= var2;
	}

	public static void main(String[] args) {
		
		int var1 = 4, var2 = 2;
		leftshift(var1, var2);
		System.out.println(var1);	//4
	}
}