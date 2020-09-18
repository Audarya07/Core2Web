class Prog2 {

	public static void main(String[] args) {
		
		int space;
		for(int i = 1; i <= 4; i++){
			char ch = 'A';
			for(space = 1; space < i; space++)
				System.out.print("  ");
			
			for(int j = space; j <= 4; j++)
				System.out.print(ch++ + " ");
                        
			System.out.println();
		}

	}
}