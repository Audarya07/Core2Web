class Prog4 {
	
	public static void main(String[] args) {
		
		int val = 100;
		System.out.println("Reverse order:");
		while(val != 0) {
			System.out.print(val + " ");
			val--;
		}
		System.out.println();
		System.out.println("Divisible by 5:");
		val = 100;
		while(val != 0) {
			if(val % 5 == 0)
				System.out.print(val + " ");
			val--;
		}	
		System.out.println();
	}
}