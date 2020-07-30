class Prog5 {

	static int isEven(int num) {
		if((num & 1) == 1){
			return 1;
		}
		else{
			return 0;
		}
	}

	public static void main(String[] args) {
		int num = 3, ans;
		System.out.println("Number = " + num);
		ans = isEven(num);
		if(ans == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
		
	}
}