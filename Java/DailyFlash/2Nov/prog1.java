class Prog1 {

	Prog1() {
		System.out.println("In Default constructor");
		methodCall();
	}

	void methodCall() {
		System.out.println("Non static method called!!");
	}

	public static void main(String[] args) {
	
		Prog1 obj = new Prog1();
	}
}