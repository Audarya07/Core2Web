class Prog3 {
	
	public static void main(String[] args) {
		
		int num = 1;
		int count = 0;
		while(true) {
			if(num % 32 == 0 && num % 7 == 0){
				if(num % 6 == 0){
					System.out.println("Breaking  the loop");
					System.out.println(num + " is divisible by 6");
					break;
				}
				else{
					System.out.println(num);
				}
			}
			num++;
			count++;
		}
	}
}