class Prog3 {
	public static void main(String[] args) {
		
		int a = 40, b = 70, c = 30;
		int max = a;
		if(b > max && b > c)
			System.out.println("Largest number is " + b);
		else if(c > max && c > b)
			System.out.println("Largest number is " + c);
		else
			System.out.println("Largest number is " + a);
	}
}