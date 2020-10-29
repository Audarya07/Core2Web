interface Team {

	void getPlayerNum(int num);
	void getPlayerName(String name);
	default void stats() {
		System.out.println("Wins = 0 | Loss = 0");
	}

	default void stats(int win, int loss) {
		System.out.println("Wins = " + win + " | Loss = " + loss);
	}
}

class CSK implements Team {

	public void getPlayerNum(int num){
	 	System.out.println("Player number => " + num);
	 }

	public void getPlayerName(String name){
	 	System.out.println("Player name => " + name);
	 }
}

class Prog4 {

	public static void main(String[] args) {
			
		CSK obj = new CSK();
		obj.getPlayerNum(7);
		obj.getPlayerName("Dhoni");
		obj.stats();
		obj.stats(3,4);

	}
}