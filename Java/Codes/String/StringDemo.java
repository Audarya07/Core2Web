class StringDemo {

	public static void main(String[] args) {

		String a = new String("Audi");
		String b = "Audi";
		System.out.println(a == b);
		a = a.intern();
		System.out.println(a == b);

	}
}
