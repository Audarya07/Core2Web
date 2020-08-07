class Prog3 {
	
	public static void main(String[] args) {
		
		int var1 = 20;
		int var2 = ++var1;		//21	var1 = 21
		int var3 = var2++;		//21	var2 = 22
		int var4 = var1--;		//21	var1 = 20

		int var5 = ++var1 + var2++ - --var2 + ++(var1++);	//22 + 22 - 22 + ++(22) = 22 + 22 - 22 + 24 = 46	
		System.out.println(var5); 	//46
	}
}