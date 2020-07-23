class Pune {

	static int covidActiveCases = 1243;
	int totalCases = 11213;

	static void noCorona() {

		System.out.println("In Pune, covid active case = " + covidActiveCases);
	}

	void lockdown() {
	
		covidActiveCases = 1300;
		totalCases = 12000;
		System.out.println("Pune lockdown active cases = " + covidActiveCases);
		System.out.println("Pune lockdown total cases = " + totalCases);
	}

	void noLockdown() {

		covidActiveCases = 1400;
		totalCases = 12500;
		System.out.println("Pune no lockdown active cases = " + covidActiveCases);
		System.out.println("Pune no lockdown total cases = " + totalCases);
	}
}


class Mumbai {

	static int covidActiveCases = 1500;
	int totalCases = 22347;

	static void noCorona() {

		System.out.println("In Mumbai, covid active case = " + covidActiveCases);
	}

	void lockdown() {
	
		covidActiveCases = 1650;
		totalCases = 23000;
		System.out.println("Mumbai lockdown active cases = " + covidActiveCases);
		System.out.println("Mumbai lockdown total cases = " + totalCases);
	}

	void noLockdown() {

		covidActiveCases = 1700;
		totalCases = 23450;
		System.out.println("Mumbai no lockdown active cases = " + covidActiveCases);
		System.out.println("Mumbai no lockdown total cases = " + totalCases);
	}
}

class Govt {
	
	public static void main(String[] args) {

		Pune kothrud = new Pune();
		kothrud.lockdown();
		kothrud.noLockdown();
		kothrud.noCorona();
		
		System.out.println("-------------------------------------");	
		Mumbai dadar = new Mumbai();
		dadar.lockdown();
		dadar.noLockdown();
		dadar.noCorona();
	}
}
