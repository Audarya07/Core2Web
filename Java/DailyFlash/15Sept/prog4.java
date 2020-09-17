class Prog4 {

	public static void main(String[] args) {
		
		int num=1;
		int num1=num;
		for(int outer = 1; outer <= 5; outer++){

			for(int inner = 1; inner <= 9; inner++){

				if(outer <= inner && (inner + outer) <= 10){

					if((inner + outer)%2 == 0){
						System.out.print(num1 + "  ");
						num1 = num1 + outer;
					}
				}
				else
					System.out.print("  ");
			}
			num=num+1;
			num1=num*num;
			System.out.println();
		}
	}
}