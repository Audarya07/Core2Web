/*(1) Logical AND (&&) --> If left value is true, it checks right expr. and outputs right value.
 * 		       --> If left value is false, it DOES NOT check right value and outputs false directly.
 *
 *(2) Logical OR (||)  --> If left value is true, it DOEN NOT check right value and outputs true directly.
 		       --> If left value id false, it checks right expr. and outputs right value.
*/

// Keeping these points in mind, I got the answers correct in first attempt.

class LogicalDemo {

	public static void main(String[] args) {

		int x = 2, y = 3;
		boolean ans;

		ans = (++x < y++) && (x++ < ++y); 
		System.out.println("Ans = " + ans);	// (3 < 3) && () --> (false) && (not evaluated) --> false
		System.out.println("x = " + x);		//3
		System.out.println("y = " + y);		//4
		
		x = 2;
		y = 3;
		ans = (++x <= y++) || (x++ > ++y); 
		System.out.println("Ans = " + ans);	// (3 <= 3) || () --> (True) || (not evaluated)  -->true
		System.out.println("x = " + x);		//3
		System.out.println("y = " + y);		//4

	}
}

