class Prog1 {

	int evenOdd(int x) {
		
		if(x % 2 == 0)
			return 1;
		else
			return 0;

	}

	public static void main(String[] args) {
		
		Prog1 obj = new Prog1();
		int a = 11;
		int ans = obj.evenOdd(a);

		if(ans == 1)
			System.out.println(a + " is even number");
		else
			System.out.println(a + "is odd number");
	}
}
