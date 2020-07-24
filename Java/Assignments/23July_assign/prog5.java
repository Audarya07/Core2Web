class Attendance {

	boolean isEligible(int val) {

		if(val > 75)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Attendance obj = new Attendance();
		int attendance = 80;
		boolean ans = obj.isEligible(attendance);
		System.out.println("Student attendance = " + attendance);
		if(ans){
			System.out.println("Processing");
			System.out.println("The student is eligible");
		}
		else {
			System.out.println("Processing...");
			System.out.println("THe student is not eligible");
		}
	}
}
