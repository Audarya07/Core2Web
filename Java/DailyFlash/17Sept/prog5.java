class Prog5 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			char ch = 'A';
			for (int j = 6; j >= i; j--) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
		for (int i = 1; i <= 6; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}