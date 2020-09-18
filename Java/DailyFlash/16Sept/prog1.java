class Prog1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++){
			char ch='C';
			for(int j = 1; j <= i; j++){
				System.out.print(ch + " ");
				ch+=4;
			}	
			System.out.println();
		}
	}
}