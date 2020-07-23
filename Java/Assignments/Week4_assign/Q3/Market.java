class Market {
	
	int noOfPermanentShops = 40;
	int noOfTemporaryShops = 15;

	void workingHours() {
		System.out.println("Vegetable shops are open from 9am to 5pm");
	}

	void selling() {
		System.out.println("Sell vegetables at high rates due to more demand");
	}	

}

class Demo {

	public static void main(String[] args) {
		
		Market market = new Market();
		market.workingHours();
		market.selling();
	}
}
