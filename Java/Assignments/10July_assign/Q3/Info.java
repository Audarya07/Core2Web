class BehroozBiryani {

	int noOfEmployees = 0;
	static int biryaniCost = 500;

	void empInfo() {

		System.out.println("Behrooz Number of employees = " + noOfEmployees);
	}

	static void biryaniInfo() {

		System.out.println("Biryani cost = " + biryaniCost);
	}
}

class ChangsChinese {
	
	int noOfEmployees = 0;
	static int noodlesCost = 250;

	void empInfo() {

		System.out.println("Changs number of employees = " + noOfEmployees);
	}

	static void noodlesInfo() {

		System.out.println("Noodles cost = " + noodlesCost);
	}
}

class Info {

	public static void main(String[] args) {

		BehroozBiryani KP = new BehroozBiryani();
		KP.noOfEmployees = 30;
		KP.empInfo();
		KP.biryaniInfo();

		BehroozBiryani karvenagar = new BehroozBiryani();
		karvenagar.noOfEmployees = 22;
		karvenagar.empInfo();
		karvenagar.biryaniInfo();

		ChangsChinese wagholi = new ChangsChinese();
		wagholi.noOfEmployees = 15;
		wagholi.empInfo();
		wagholi.noodlesInfo();

		wagholi.noodlesCost = 300;

		ChangsChinese dapodi = new ChangsChinese();
		dapodi.noOfEmployees = 19;
		dapodi.empInfo();
		dapodi.noodlesInfo();
	}
}
