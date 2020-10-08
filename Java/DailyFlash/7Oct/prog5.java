class Prog5 {

	public static void main(String[] args) {
		
		int[][] arr ={{50,60,70,90}, {20,40,80}, {55,77,66,91}};

		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int avg = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				avg = sum/arr[i].length;
			}
			System.out.println("Average of Student " + (i+1) + " is: " + avg);
		}
	}
}