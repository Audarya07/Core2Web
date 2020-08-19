class Prog1 {

	public static void main(String[] args) {
		
		char ch = '2';
		if(ch >=65 && ch <= 91)
			System.out.println(ch + " is uppercase");
		else if(ch >=97 && ch <= 123)
			System.out.println(ch + " is lowercase");
		else
			System.out.println(ch + " is invalid");

	}
}