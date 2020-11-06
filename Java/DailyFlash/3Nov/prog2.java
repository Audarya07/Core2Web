class Prog2 {

	public static void main(String[] args) {
		
		for (int i = 2; i > -2; i--) {
			for (int j = 1; j < Math.abs(i) + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 2; k > Math.abs(i); k--) {
				System.out.print("^ ");
			}
			System.out.println();
		}	
		for (int i = 3; i > 0; i--) {
			for (int j = 3; j > 0; j--) {
				if(i >= j)
					System.out.print("~ ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}