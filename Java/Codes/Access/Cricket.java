class T20{
	static String cap = "Kohli";
	int toss = 0;

	static void list(){
		System.out.println("Player list");
		System.out.println(cap);
		T20 obj = new T20();
		System.out.println(obj.toss);
	}

	void batOrBowl(){
		System.out.println("Decision");
		System.out.println(cap);
		System.out.println(toss);
	}

	public static void main(String[] args){
		T20 fm = new T20();

		list();
		fm.batOrBowl();
		//System.out.println(cap);
		//System.out.println(fm.toss);

	}
}
