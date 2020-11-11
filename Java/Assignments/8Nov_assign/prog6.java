class Material {

	static float totPrice;
	Material(String name, float price) {
		totPrice += price;
		System.out.println("Adding price of " + name + "...total price = " + totPrice);
	}

	static void dispPrice() {
		System.out.println("Total price = " + totPrice);
	}
}

class House {

	public static void main(String[] args) {
		
		Material ironRod = new Material("Iron Rod", 1500);
		Material cement = new Material("Cement", 2000);
		Material bricks = new Material("Brick", 1000);

		Material.dispPrice();
	}
}