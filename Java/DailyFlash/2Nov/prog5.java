class Prog5 {

	int var;
	String name;

	Prog5(int var, String name) {
		System.out.println("In parameterized constructor!!");
		this.var = var;
		this.name = name;
	}

	public static void main(String[] args) {
	
		Prog5 obj1 = new Prog5(111, "Audi");
		System.out.println("After object creation...");
		System.out.println(obj1.var);
		System.out.println(obj1.name);
	}
}