class Prog3 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5;
		System.out.println((num1++ | num2) & ((++num2) ^ num1));
		//(10 | 5) & (6 ^ 11) = (15) & (13) = 13
	}
}

/*Precedence:
 1. () has greater precedence than  any operator like &, | and ^ in given expression...sp brackets are evaluated first.
 2. ++ has greater than &, | and ^
 3. Finally &, | and ^ operators are applied on operands. 
 */

