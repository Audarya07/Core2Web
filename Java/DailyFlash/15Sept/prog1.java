class Prog1 {

	public static void main(String[] args) {
		
		int m;
		char ch='A';
		char ch1=ch;
		for(int i = 5; i >= 1; i--){
			
			for(m = 1; m < i; m++)
				System.out.print("  ");

			for(int j = m;j <= 5; j++){
				System.out.print(ch1 + " ");
				ch1++;
			}	
			ch++;
			ch1=ch;
			System.out.println();
		}
	}
}