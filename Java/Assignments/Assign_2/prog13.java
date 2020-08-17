class Prog13 {

	public static void main(String[] args) {
		
		int num = 1, rem, sum = 0, val = num;
		int square = num * num;
		while(square != 0){
			rem = square % 10;
			square /= 10;
			sum += rem;
		}
		if(sum == val)
			System.out.println(val + " is a Neon number");
		else
			System.out.println(val + " is NOT Neon number");
	}
}

// 0, 1 and 9 are the only Neon numbers