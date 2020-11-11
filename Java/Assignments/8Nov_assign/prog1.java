class Infantry {

	static int numSoldiers;
	
	Infantry() {

	}

	Infantry(int numSoldiers) {
		this.numSoldiers = numSoldiers;	
	}
}

class Army {
		
	Infantry obj = new Infantry(400);
	void dispInfantry() {
		System.out.println("Total soldiers = " + obj.numSoldiers);
	}
}

class Defence {
	
	public static void main(String[] args) {
		
		Army indianArmy = new Army();
		indianArmy.dispInfantry();

		Infantry obj1 = new Infantry();
		System.out.println(obj1.numSoldiers);	
	}
}

