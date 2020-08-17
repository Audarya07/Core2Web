class Prog17 {
	static boolean isPrime(int num) {
		int flag = 0;
		for (int i = 2; i <= num/2; i++) {
			if(num % i == 0){
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		
		int num = 4;
		if(isPrime(num))
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is NOT prime number");
	}

}