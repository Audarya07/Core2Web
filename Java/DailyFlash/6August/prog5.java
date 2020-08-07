class Prog5 {

	public static void main(String[] args) {
		
		int val = 3;
		System.out.println("Table of 3 : ");
		for (int i = 1; i <= 10; i++) {

			System.out.print(val * i + " ");	
		}
		System.out.println();
		System.out.println("Even numbers present in table:");
		for (int i = 1; i <= 10; i++) {

			if((val * i) % 2 == 0)
				System.out.print(val * i + " ");	
		}
		System.out.println();
	}
}