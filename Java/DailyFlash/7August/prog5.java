class Prog5 {
	
	public static void main(String[] args) {
		
		int num = 12345;
		int val = num;
		int avg = 0, sum = 0, count = 0;
		while(num != 0) {
			
			int rem = num % 10;
			sum += rem;
			count++;
			num /= 10;
		}
		avg = sum/count;
		System.out.println("The average of digits from " + val + " is " + avg);
	}
}