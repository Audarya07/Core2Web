/*

* * * * * 
* * * * 
* * * 
* * 
*
 
*/

class Pattern1 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 4; i++) {
			int n = 4;
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}