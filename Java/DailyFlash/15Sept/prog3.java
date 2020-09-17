class Prog3 {

	public static void main(String[] args) {
		
		int m;
		int num=5;
		int num1=num;
      	for(int outer=5;outer >= 1; outer--){

        	for(m = 1; m < outer; m++)
                System.out.print("  ");

            for(int inner = m; inner <= 5; inner++){
                System.out.print(num1 * num1 + " ");
				num1++;
        	}

			num=num-1;
			num1=num;
           	System.out.println();
        }
}
}