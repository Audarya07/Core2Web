class Human {

	public static void main(String[] args) {

		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();
		
		boolean isLionHuman = lion instanceof Human;	//false
		System.out.println("Are lion and humans of same species = " + isLionHuman);
		
		boolean isTigerHuman=tiger instanceof Human;	//false
		System.out.println("Are tiger and Human of same species = " + isTigerHuman);
		
		boolean isPumaHuman=puma instanceof Human;	//false
		System.out.println("Are puma and Human of same species = " + isPumaHuman);
		
		boolean isMonkeyHuman=monkey instanceof Human;	//true
		System.out.println("Are monkey and Human of same species = " + isMonkeyHuman);
	}
}
