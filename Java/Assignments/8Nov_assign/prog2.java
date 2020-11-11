class Cake{

	Chocolate c = new Chocolate(150);
	Egg e = new Egg(80);
	Cream cr=  new Cream(100);

	static int totCalories;

	void dispCalories() {
		totCalories = c.cal + e.cal + cr.cal;
		System.out.println("Total calories in cake:" + totCalories);
	}
}

class Chocolate {
	int cal;
	Chocolate(int cal) {
		this.cal = cal;
	}
}

class Egg {
	int cal;
	Egg(int cal) {
		this.cal = cal;
	}
}

class Cream {
	int cal;
	Cream(int cal) {
		this.cal = cal;
	}
}

class Calories {
	
	public static void main(String[] args) {
		
		Cake obj = new Cake();
		obj.dispCalories();
	}
}