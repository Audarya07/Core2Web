class Prog4 {
	
	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = ++var1 + ++var1;
		System.out.println(var1);	// 12
		System.out.println(var2);	// 23
	}
}