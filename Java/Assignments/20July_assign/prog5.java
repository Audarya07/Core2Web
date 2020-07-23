class Football {

	int noOfGoals = 0;
	static int noOfLeagueMatches = 0;

	void dispGoals() {
		
		System.out.println("Number of goals: " + noOfGoals);
	}

	static void leagueInfo() {

		System.out.println("Total match played in league: " + noOfLeagueMatches);
	}
}

class Game {

	public static void main(String[] args) {
		
		Football FCB = new Football();
		FCB.noOfGoals = 5;
		Football.noOfLeagueMatches++;
		FCB.dispGoals();
		FCB.leagueInfo();
		
		Football dortmund = new Football();
		dortmund.noOfGoals = 2;
		Football.noOfLeagueMatches++;
		dortmund.dispGoals();
		dortmund.leagueInfo();
	}
}
