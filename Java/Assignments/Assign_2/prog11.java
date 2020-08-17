class Prog11 {

	public static void main(String[] args) {
		
		int num = 25;
		System.out.print("Perfect divisors of " + num + " = ");
		for (int i = 2; i < num; i++) {
			if(num % i == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}