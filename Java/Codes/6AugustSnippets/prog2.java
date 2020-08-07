class Prog2 {
	
	public static void main(String[] args) {
		
		double var1 = 20.5;
		double var2 = var1++;
		System.out.println(var2);	// 20.5
		double var3 = ++var1;
		System.out.println(var3);	// 22.5
	}
}