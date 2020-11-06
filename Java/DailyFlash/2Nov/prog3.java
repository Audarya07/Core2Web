class Type1 {

	//default access specifier
	Type1() {
		System.out.println("In default constructor");
	}

	Type1(int a) {
		System.out.println("In parameterized constructor");
		System.out.println("a = " + a);
	}
}

class Type2 {
	
	//public access specifier
	public Type2() {
		System.out.println("In default public constructor");
	}

	public Type2(int a) {
		System.out.println("In parameterized public constructor");
		System.out.println("a = " + a);
	}
}
/*
class Type3 {
	
	//private access specifier
	private Type3() {
		System.out.println("In default private constructor");
	}

	private Type3(int a) {
		System.out.println("In parameterized private constructor");
		System.out.println("a = " + a);
	}
}
*/

class Type4 {
	
	//PROTECTED access specifier
	protected Type4() {
		System.out.println("In default protected constructor");
	}

	protected Type4(int a) {
		System.out.println("In parameterized protected constructor");
		System.out.println("a = " + a);
	}
}

class Prog3{

	public static void main(String[] args) {
		
		Type1 obj1 = new Type1();
		Type1 obj2 = new Type1(10);

		Type2 obj3 = new Type2();
		Type2 obj4 = new Type2(20);
/*
		Type3 obj5 = new Type3();
		Type3 obj6 = new Type3(30);		
*/
		Type4 obj7 = new Type4();
		Type4 obj8 = new Type4(40);
	}
}

// Private constructor not allowed