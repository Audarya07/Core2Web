class Prog3 {

	public static void main(String[] args) {
		
		char ch = '8';
		if((ch >= 97 && ch <= 123) || (ch >=65 && ch <= 91))
			System.out.println(ch + " is an alphabet");
		else if(ch >=48 && ch <= 57)
			System.out.println(ch + " is a Number");
		else
			System.out.println(ch + " is a special character");
	}
}