class Prog7 {

	public static void main(String[] args) {
		
		int a = 50, b = 30, c = 11, min = a;
		if(b < min && b < c)
			min = b;
		else if(c < b)
			min = c;
		System.out.println("Minimum number from " + a + " " + b + " " + c + " is  = " +min);
	}
}