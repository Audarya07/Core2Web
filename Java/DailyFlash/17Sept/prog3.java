class Prog3 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			int cnt = 0;
			for (int j = 1; j <= 5; j++) {	
				if(i >= 2 && i < 5){
					if(j >= 3)
						System.out.print(" ");
					else
						System.out.print(i + " ");
				}
				else
					System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}