class Prog4 {

	Prog4(int s) {
		System.out.println("Area of square = " + (s*s));
	}

	Prog4(int l, int b) {
		System.out.println("Area of rectangle = " + (l*b));
	}

	public static void main(String[] args) {
		
		Prog4 obj1 = new Prog4(4);
		Prog4 obj2 = new Prog4(4, 5);
	}
}