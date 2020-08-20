class Prog5 {

	public static void main(String[] args) {
		
		int p = 70, c = 80, m = 90, b = 60, comp = 87;
		float per = ((float)(p+c+m+b+comp)/500)*100;
		per = (int)per;
		if(per >= 90)
			System.out.println("Grade A");
		else if(per >=80)
			System.out.println("Grade B");
		else if(per >=70)
			System.out.println("Grade C");
		else if(per >=60)
			System.out.println("Grade D");
		else if(per >= 40)
			System.out.println("Grade E");
		else if(per < 40)
			System.out.println("Grade F");
	}
}