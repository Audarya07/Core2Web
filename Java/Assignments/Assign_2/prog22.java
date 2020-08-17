class Prog22 {

	public static void main(String[] args) {
		
		char ch = 'C';
		String var;
		System.out.println("Charatcter : " + ch);
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			var = "Vowel";
		else
			var = "Consonant";
		switch(var) {
			case "Vowel":
				System.out.println(ch + " is a vowel" );
				break;
			case "Consonant":
				System.out.println(ch + " is a consonant");
				break;
		}
	}
}