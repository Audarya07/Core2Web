class Prog2 {

	public static void main(String args[]) {

		int num = 1;
		for(int i=1;i<=4;i++) {

			for(int j=0;j<i;j++) {

				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
