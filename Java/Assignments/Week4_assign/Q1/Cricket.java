class Cricket {
	
	int noOfBatsmen = 6;	//state
	int noOfBowler = 3;		//state
	int noOfAllRounder = 2;	//state

	void playMatch() {		//behaviour
		
		System.out.println(noOfBatsmen + " Batsmen, " + noOfBowler + " Bowlers and " + noOfAllRounder + " All rounders are ready to play the match");
	}

	public static void main(String[] args) {
		
		Cricket cricket = new Cricket();
		cricket.playMatch();
	}
}
