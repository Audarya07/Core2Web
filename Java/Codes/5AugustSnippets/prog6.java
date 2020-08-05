class Prog6 {

	public static void main(String[] args) {
		
		int var1 = 23;
		double var2 = 23.5;
		boolean b = (var1 = var2);
		System.out.println(b);		// error
	}
}