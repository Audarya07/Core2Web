// Write a program to count number of digits in a number

class Prog1 {
	
	public static void main(String[] args) {
		
		int num = 1345;
		int count = 0;
		while(num != 0) {

			int rem = num % 10;
			count++;
			num /= 10;
		}
		System.out.println(count);
	}
}