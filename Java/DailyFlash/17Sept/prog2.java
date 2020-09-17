class Prog2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int val = (i+j-1);
				if(val > 5)
					System.out.print(val%5 + " ");
				else
					System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}