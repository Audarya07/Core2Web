class Prog5 {

	public static void main(String[] args) {
		
		int a = 1, b = 4, c = 2, max = a;
		if(b > max && b > c)
			max = b;
		else if(c > b & c > max)
			max = c;
		System.out.println(max + " is max among " + a + " " + b + " " + c);

	}
}