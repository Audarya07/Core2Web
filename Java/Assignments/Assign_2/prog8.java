class Prog8 {

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
		
		int num = 435621, num2 = num,rem, val = -1;
		System.out.print("The prime digit from " + num + " is: ");
		while(num != 0){
			rem = num % 10;
			num /= 10;
			if(isPrime(rem) && rem != val){
				val = rem;
				System.out.print(rem + " ");
			}
		}
		System.out.println();
	}
}