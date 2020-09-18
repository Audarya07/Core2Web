class Prog5 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++){
			for(int j = 1; j <= 5; j++){
				if((j+i) <= 6 || (i-j) >= 5)
					if(i <= 5)
						System.out.print("= ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}