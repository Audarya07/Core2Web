class Army {

	int regimentSize = 0;
	static String chief = "Manoj Naravane";

	void regimentInfo() {
		
		System.out.println("Regiment size = " + regimentSize);
	}

	static void chiefInfo() {
		
		System.out.println("Army Chief = " + chief);
	}
}

class Navy {
	
	int noOfSoldiers = 0;
	static int noOfSubmarines = 15;

	void soldierInfo() {
		
		System.out.println("Number of Soldiers = " + noOfSoldiers);
	}

	static void submarineInfo() {
		
		System.out.println("Submarine count = " + noOfSubmarines);
	}
}

class AirForce {
	
	int noOfJets = 0;
	static String chief = "R. Bhadauria";

	void jetInfo() {
		
		System.out.println("Number of Jets = " + noOfJets);
	}

	static void chiefInfo() {

		System.out.println("Air force chief = " + chief);
	}

}

class Main {

	public static void main(String[] args) {
		
		Army rajputReg = new Army();
		rajputReg.regimentSize = 800;
		rajputReg.regimentInfo();
		rajputReg.chiefInfo();

		Navy easternFleet = new Navy();
		easternFleet.noOfSoldiers = 450;
		easternFleet.soldierInfo();
		easternFleet.submarineInfo();

		easternFleet.noOfSubmarines = 18;

		Navy westernFleet = new Navy();
		westernFleet.noOfSoldiers = 500;
		westernFleet.soldierInfo();
		westernFleet.submarineInfo();

		AirForce squad1 = new AirForce();
		squad1.noOfJets = 8;
		squad1.jetInfo();
		squad1.chiefInfo();

	}
}

