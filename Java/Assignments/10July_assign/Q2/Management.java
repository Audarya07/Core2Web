class MithaiShop {

	int mithaiQuantity = 0;
	static boolean mithaiRecipeChanged = false;

	void dispMithaiQuant() {

		System.out.println("Mithai quantity = " + mithaiQuantity);
	}

	static void recipeInfo() {

		System.out.println("Mithai recipe changed = " + mithaiRecipeChanged);
	}
}

class MacD {
	
	int burgerStock = 0;
	static int avgIncome = 150000;

	void dispStock() {

		System.out.println("Burger stock = " + burgerStock);
	}

	static void incomeStat() {

		System.out.println("MacD income info = " + avgIncome);
	}
}

class Management {

	public static void main(String[] args) {

		MithaiShop warje = new MithaiShop();
		warje.mithaiQuantity = 760;
		warje.dispMithaiQuant();
		warje.recipeInfo();
		
		warje.mithaiRecipeChanged = true;
	
		MithaiShop vadgaon = new MithaiShop();
		vadgaon.mithaiQuantity = 500;
		vadgaon.dispMithaiQuant();
		vadgaon.recipeInfo();

		MacD deccan = new MacD();
		deccan.burgerStock = 450;
		deccan.dispStock();
		deccan.incomeStat();

		MacD pimpri = new MacD();
		pimpri.burgerStock = 650;
		pimpri.dispStock();
		pimpri.incomeStat();
	}
}
