class Relational {

	public static void main(String[] args) {

		int a = 10, b = 20;
		boolean ans;	//int ans --> will give error
				//Relational operators return boolean answer

		ans = a == b;
		System.out.println(ans);	//false
		
		ans = a <= b;
		System.out.println(ans);	//true
		
		ans = a >= b;
		System.out.println(ans);	//false
		
		ans = a != b;
		System.out.println(ans);	//true
		
		ans = a < b;
		System.out.println(ans);	//true
		
		ans = a > b;
		System.out.println(ans);	//false
	}
}
