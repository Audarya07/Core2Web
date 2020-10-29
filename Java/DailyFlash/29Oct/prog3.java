abstract class Car {

	abstract void mileage();
	abstract void price(int price);

	void seater(){
		System.out.println("4 Seater");
	}
}

class Duster extends Car {
	
	void mileage(){
		System.out.println("Duster has mileage of 15 kmpl");
	}

	void price(int price) {
		System.out.println("Duter price => " + price + " lakhs");
	}

	void seater(){
		System.out.println("5 seater");
	}
}

class Scorpio extends Car {
	
	void mileage(){
		System.out.println("Scorpio has mileage of 17 kmpl");
	} 

	void price(int price) {
		System.out.println("Duter price => " + price + " lakhs");
	}

	void seater(){
		System.out.println("7 seater");
	}
}

class Prog3 {

	public static void main(String[] args) {
		
		Duster car1 = new Duster();
		car1.mileage();
		car1.price(10);
		car1.seater();

		Scorpio car2 = new Scorpio();
		car2.mileage();
		car2.price(14);
		car2.seater();
	}
}