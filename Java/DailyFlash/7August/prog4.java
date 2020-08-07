class Prog4 {
	
	public static void main(String[] args) {
		
		int num = 127599;
		int val = num;
		int max = 0;
		while(num != 0) {
			
			int rem = num % 10;
			if(rem > max)
				max = rem;
			num /= 10;
		}
		System.out.println("Maximum digit from " + val + " is " + max);
	}
}