class Prog15 {

	public static void main(String[] args) {
		
		int num = 123, count = 0, val = num;
		while(num != 0){
			if(num % 2 == 0){
				num /= 2;
				count += 1;
			}
			else{
				num -= 1;
				count += 1;
			}
		}
		System.out.println("Steps required to reduce " + val + " is = " + count);
	}
}