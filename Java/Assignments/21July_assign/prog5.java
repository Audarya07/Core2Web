class Arithmetic {

	int a = 20, b = 5;
	static void operatorInfo() {

		System.out.println("THere are 5 Arithmetic operators");
	}

	void operations() {
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));

	}

}

class Logical {

	int a = 20, b = 5;
	static void operatorInfo() {

		System.out.println("There are 3 Logical operators");
	}

	void operations() {
		
		System.out.println("(a < 10) && (b == 5) --> " + ((a<10)&&(b==5)));
		System.out.println("(a < 10) || (b == 5) --> " + ((a<10)||(b==5)));
		System.out.println("!(a < 10) --> " + !(a<10));
	}
}

class Bitwise {

	int a = 20, b = 3;
	static void operatorInfo() {

		System.out.println("There are 7 Bitwise operators");
	}

	void operations() {
		
		System.out.println("a & b = " + (a&b));
		System.out.println("a | b = " + (a|b));
		System.out.println("~a = " + (~a));
		System.out.println("a ^ b = " + (a^b));
		System.out.println("a << b = " + (a<<b));
		System.out.println("a >> b = " + (a>>b));
		System.out.println("a >>> b = " + (a>>>b));

	}
}

class Operators {

	public static void main(String[] args) {

		System.out.println("------Arithmetic Operations---------");
		Arithmetic.operatorInfo();
		Arithmetic obj1 = new Arithmetic();
		obj1.operations();
		
		System.out.println("-------Logical Operations--------");
		Logical.operatorInfo();
		Logical obj2 = new Logical();
		obj2.operations();
		
		System.out.println("--------Bitwise Operations---------");
		Bitwise.operatorInfo();
		Bitwise obj3 = new Bitwise();
		obj3.operations();
	}
}
