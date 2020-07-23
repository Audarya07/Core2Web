class ABP {
	
	int noOfShows = 40;
	static int TRP = 600;

	void shows() {
		
		System.out.println("ABP number of Shows = " + noOfShows);
	}

	static void ratings() {
		
		System.out.println("ABP TRP rating = " + TRP);
	}
}

class ZEE {
	
	int noOfShows = 45;
	static int TRP = 900;

	void shows() {
		
		System.out.println("ZEE number of Shows = " + noOfShows);
	}

	static void ratings() {
		
		System.out.println("ZEE TRP rating = " + TRP);
	}
}


class NewsChannels {
	
	public static void main(String[] args) {
		
		ABP ABPMajha = new ABP();
		ABPMajha.noOfShows = 30;
		ABPMajha.shows();
		ABPMajha.ratings();

		ABP ABPNews = new ABP();
		ABPNews.noOfShows = 10;
		ABPNews.shows();
		ABPNews.ratings();


		ZEE ZEENews = new ZEE();
		ZEENews.noOfShows = 40;
		ZEENews.shows();
		ZEENews.ratings();


		ZEE ZEEBusiness = new ZEE();
		ZEEBusiness.noOfShows = 5;
		ZEEBusiness.shows();
		ZEEBusiness.ratings();
	}
}
