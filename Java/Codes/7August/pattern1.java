/*
	1 2 3 4
	5 6 7 8
	9 10 11 12
	13 14 15 16
*/

class Pattern1 {
	
	public static void main(String[] args) {
		int var = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(var + "  ");
				var++;
			}
			System.out.println();
		}
	}
}