class Prog16 {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println("Self dividing numbers:");
		while(num < 101) {
			int val = num, rem, flag = 0;
			while(val != 0){
				rem = val % 10;
				val /= 10;
				if(rem != 0 && num % rem == 0)
					flag = 1;
				else{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
				System.out.println(num);
			num += 1; 
		}	
	}
}