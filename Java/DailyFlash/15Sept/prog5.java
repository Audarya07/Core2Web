class Prog5 {

	public static void main(String[] args) {
		
		int num = 1;
		int num1 = num;

		for(int i = 1; i <= 5; i++){
			for(int j = 5; j >= i; j--){
				System.out.print(num1 + " ");
				num1++;
			}

			num = num + 2;
			num1 = num;
			System.out.println();
		}
	}
}