class Prog10 {

	static float power(float n, int pow){
		if(pow == 0)
			return 1;
		if(pow < 0){
			n = 1/n;
			pow = -pow;
		}
		float y = power(n, pow/2);
		if(pow % 2 == 0)
			return y * y;
		else
			return n * y * y;
	}

	public static void main(String[] args) {
		
		float num = 100;
		int pow = 2;
		float ans = power(num, pow);
		System.out.println((int)num + " to the power " + pow + " is = " + ans);
	}
}