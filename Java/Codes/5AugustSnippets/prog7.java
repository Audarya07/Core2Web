class Prog7 {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = var1 == 10 ? var1++ : ++var1;
		System.out.println(var2);		// 10
	}
}