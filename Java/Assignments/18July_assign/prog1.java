class Main {

	public static void main(String[] args) {

		int a = 10, b = 20;
		boolean ans;
		
		System.out.println("a = " + a + "and b = " + b);
		ans = (a < b);
		System.out.println("a < b = " + ans);
		
		ans = (a > b);
		System.out.println("a > b = " + ans);
		
		ans = (a <= b);
		System.out.println("a <= b = " + ans);
		
		ans = (a >= b);
		System.out.println("a >= b = " + ans);
		
		ans = (a == b);
		System.out.println("a ==  b = " + ans);
		
		ans = (a != b);
		System.out.println("a != b = " + ans);
	}
}
