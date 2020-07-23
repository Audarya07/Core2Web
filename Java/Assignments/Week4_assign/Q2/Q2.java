class Child {

	int a = 10;
	static int b = 20;
}

class Demo {

	public static void main(String[] args) {

		Child c1 = new Child();
		Child c2 = new Child();

		c1.a = 40;
		c1.b = 40;

		System.out.println(c1.a + " " + c1.b);	// 40 40
		System.out.println(c2.a + " " + c2.b);	// 10 40
	}
}

