class Prog2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[4];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k * k;
					k++;							
			}
		}

		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}