class Prog5 {

	public static void main(String[] args) {
		
		int num = 55;
		if(num % 5 == 0 && num % 11 == 0)
			System.out.println(num + " is divisible by 5 and 11");
		else
			System.out.println(num + " is NOT divisible by 5 and 11");
	}
}