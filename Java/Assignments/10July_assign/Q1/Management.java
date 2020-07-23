class YewaleChaha {

	int dailyIncome = 0;
	static int totalBranches = 25;

	void dispIncome() {

		System.out.println("Yewale Chaha Daily Income = " + dailyIncome);
	}

	static void dispStat() {

		System.out.println("Yewale Chaha total branches = " + totalBranches);
	}
}

class RohitWade {
	
	int wadeSoldDaily = 0;
	static int totalBranches = 15;

	void dispWadeCount() {

		System.out.println("Wade sold daily = " + wadeSoldDaily);
	}

	static void dispStat() {

		System.out.println("Rohit wade total branches = " + totalBranches);
	}
}

class Management {

	public static void main(String[] args) {

		YewaleChaha shivajinagar = new YewaleChaha();
		shivajinagar.dailyIncome = 10000;
		shivajinagar.dispIncome();
		shivajinagar.dispStat();

		YewaleChaha sangvi = new YewaleChaha();
		sangvi.dailyIncome = 15000;
		sangvi.dispIncome();
		sangvi.dispStat();

		RohitWade narhe = new RohitWade();
		narhe.wadeSoldDaily = 550;
		narhe.dispWadeCount();
		narhe.dispStat();

		narhe.totalBranches = 14;

		RohitWade swargate = new RohitWade();
		swargate.wadeSoldDaily = 630;
		swargate.dispWadeCount();
		swargate.dispStat();
	}
}
