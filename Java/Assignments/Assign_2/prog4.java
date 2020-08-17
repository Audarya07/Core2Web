class Prog4 {

	public static void main(String[] args) {
		
		int arr[] = {10,8,56,23,45,97};
		int n = arr.length;
		int first = -1000, second = -1000;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
		if(n < 2)
			System.out.println("Invalid!!");

		for (int i = 0; i < n; i++) {
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}				
			else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		System.out.println("Second max = " + second);
	}
}