class Angle {

	void isAcute(int x) {

		if(x < 180) {
			System.out.println("Angle = " + x);
			System.out.println("Acute angle");
		}
		else if(x > 180) {
			System.out.println("Angle = " + x);
			System.out.println("Obtuse angle");
		}
		else {
			System.out.println("Angle = " + x);
			System.out.println("Straight line");
		}
	}

	public static void main(String[] args) {

		Angle obj = new Angle();
		int angle = 100;
		obj.isAcute(angle);
		angle = 200;
		obj.isAcute(angle);
	}
}
