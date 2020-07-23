class Operations {

	int a = 50;
	int b = 10;

	void addition() {
	
		int add = a + b;
		System.out.println("Addition = " + add);
	}


	void subtraction() {
	
		int sub = a - b;
		System.out.println("Subtraction = " + sub);
	}

	void multiplication() {
	
		int mul = a * b;
		System.out.println("Multiplication= " + mul);
	}

	void division() {
	
		int div = a / b;
		System.out.println("Division = " + div);
	}

	void modulus() {
	
		int mod = a % b;
		System.out.println("Modulus = " + mod);
	}
}

class Main {

	public static void main(String[] args) {

		Operations obj = new Operations();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
		obj.modulus();
	}
}
