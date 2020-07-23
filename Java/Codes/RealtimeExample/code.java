class NisargCyclone {

	String cyclone = "Nisarg";
	static int speed = 120;
	int numOfAffectedPlaces = 15;

	
	void reasonsOfCyclone() {
		
		System.out.println("Climate change and rise in temperature of sea surface");
	}
	
	static void casualties() {
		
		System.out.println("2 Dead and 3 injured!!!");
	}
}

class Nature {
	
	public static void main(String[] args) {

		NisargCyclone obj = new NisargCyclone();
		obj.reasonsOfCyclone();
		obj.casualties();
		NisargCyclone.casualties();
	}
}
