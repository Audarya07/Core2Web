class Prog4 {

	public static void main(String[] args) {
		int n = 3*2-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int val = i < j ? i : j;
				val = val < n - i ? val : n - i -1;
				val = val < n - j ? val : n - j -1;
				System.out.print(3-val + " ");
 			}			
			System.out.println();
		}		

	}
}