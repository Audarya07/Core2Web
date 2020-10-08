class Prog4{

	public static void main(String[] args) {
		
		int[][] arr ={{2,3,4,5}, {1,2}, {5,8,2,1,2}, {1,2,7}};

		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Person " + (i+1) + "read: " + sum + " books");
		}
	}
}