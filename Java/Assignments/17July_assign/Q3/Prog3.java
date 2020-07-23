class Prog3 {

	public static void  main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 50;

		int ans = a++ + ++b + ++c;	//10 + 21 + 51 = 82 
		System.out.println("Answer = " + ans);
	}
}
