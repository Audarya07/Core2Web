class Prog3 {

	public static void main(String[] args) {
		
		int val = 20;
		
		for (int num = 2; num <= val; num++) {
			
			int flag = 1;
			for (int i = 2; i <= num/2; i++) {
					
					if(num%i == 0){
						flag = 0;
						break;
					}
			}
			if(flag == 1)
				System.out.print(num + " ");
		}
		System.out.println();
	}
}