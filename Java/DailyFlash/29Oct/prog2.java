class MarutiSuzuki {

	void engine() {
		System.out.println("MarutiSuzuki engine started !!");
	}
}

class Maruti extends MarutiSuzuki {

	void engine() {
		System.out.println("Maruti engine started !!");	
	}
}

class Suzuki extends MarutiSuzuki {

	void engine() {
		System.out.println("Suzuki engine started !!");	
	}	
}

class Prog2 {

	public static void main(String[] args) {
		
		MarutiSuzuki car1 = new MarutiSuzuki();
		car1.engine();

		MarutiSuzuki car2 = new Maruti();
		car2.engine();

		MarutiSuzuki car3 = new Suzuki();
		car3.engine();

		Maruti car4 = new Maruti();
		car4.engine();

		Suzuki car5 = new Suzuki();
		car5.engine();
	}
}