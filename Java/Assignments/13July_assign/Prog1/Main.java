class InnovateApps {

	static boolean banChineseApps = false;
	int indianApps = 0;
	
	void appInfo(){
		
		System.out.println("No. of Indian Apps = " + indianApps);
	}	

	static void chineseAppStatus() {
	
		System.out.println("Are chinese apps banned = " + banChineseApps);
	}
}


class Main {

	public static void main(String[] args) {
		
		InnovateApps hackathon = new InnovateApps();
		hackathon.chineseAppStatus();
		System.out.println("--------Government takes decision-----");
		hackathon.banChineseApps = true;
		hackathon.chineseAppStatus();
		hackathon.indianApps = 52;
		hackathon.appInfo();

	}
}
