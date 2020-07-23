class Dominoes {

	int price = 0;
	int quantity = 0;
	static int total = 0;
	static void bill() {
		
		System.out.println("Total biil = " + total); 
	}
}

class Main {

	public static void main(String[] args) {

		Dominoes pizza = new Dominoes();
		pizza.price = 200;
		pizza.quantity = 2;

		Dominoes fries = new Dominoes();
		fries.price = 80;
		fries.quantity = 1;

		Dominoes.total = (pizza.price * pizza.quantity) + (fries.price * fries.quantity);

		Dominoes.bill();
	}
}
