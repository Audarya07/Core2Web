/*

* * * * 
  * * * 
    * * 
      * 

*/

class Pattern4 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			for (int space = 1; space < i; space++) {
				System.out.print("  ");
			}
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}