class Prog1 {

	public static void main(String[] args) {
		
		int year = 2000;
		int flag = 0;
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			flag = 1;
		}
		
		if(flag == 0)
			System.out.println(year + " is NOT a leap year");
		else
			System.out.println(year + " is a leap year");

	}
}