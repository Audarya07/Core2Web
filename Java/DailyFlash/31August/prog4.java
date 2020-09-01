class Prog4 {

	public static void main(String[] args) {
		
		for(int outer=1;outer<=5;outer++){
			for(int inner=1;inner<=outer;inner++){
				if(outer%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			
			System.out.println();
		}

	}
}