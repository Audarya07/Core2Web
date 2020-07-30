class Prog2 {
	public static void main(String[] args) {
		char c = 'b';
		int ascii = c;
		if(c >= 'A' && c <= 'Z')
			System.out.println((char)((int)c + 32));
		else if(c >= 'a' && c <= 'z')
			System.out.println((char)((int)c - 32));
	}
}