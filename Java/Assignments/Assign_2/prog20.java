class Prog20 {

	public static void main(String[] args) {
		int ch1 = 65, ch2 = 97;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if(i % 2 == 0){
					System.out.print((char)ch2 + " ");
					ch2 += 1;
				}
				else{
					System.out.print((char)ch1 + " ");
					ch1 += 1;
				}
			}
			System.out.println();
		}
	}
}