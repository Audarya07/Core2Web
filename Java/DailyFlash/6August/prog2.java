class Prog2 {
	public static void main(String[] args) {
		
		int yr = 3;

		switch(yr) {
			case 1:
				System.out.println("1st year students not eligible for scholarship");
				break;

			case 2:
				System.out.println("2nd year students not eligible for scholarship");
				break;

			case 3:
				int marks = 80;
				switch(marks) {
					case 40:
						System.out.println("Marks = " + marks);
						System.out.println("Very low marks...not eligible for education scholarship!!");		
						break;
					case 80:
						System.out.println("Marks = " + marks);
						System.out.println("Eligible for education scholarship!!");		
						break;
				}
				break;

			case 4:
				System.out.println("4th year students not eligible for scholarship");
				break;
		}
	}
}