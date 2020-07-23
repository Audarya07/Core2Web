//Logical operators require boolean value on their both sides to compare
//It gives error for any other data type.

//But comparing any value is allowed in C.


class Logical {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		boolean ans;

		ans = (a < b) && (a != b);
		System.out.println(ans);	//true
		
		ans = (a == b) || (a > b);
		System.out.println(ans);	//false
	}
}
