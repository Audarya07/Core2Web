class Prog4 {

	Prog4(int a) {
		System.out.println("In parameterized constructor!!");
		dummyMethod();
	}

	void dummyMethod() {
		System.out.println("Inside dummy Method");
	}

	public static void main(String[] args) {
		
		Prog4 obj1 = new Prog4(100);
	}
}