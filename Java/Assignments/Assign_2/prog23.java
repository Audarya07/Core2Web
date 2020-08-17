class Prog23 {

	public static void main(String[] args) {
		
		int a = 10, b = 15;
		int ans = (a > b) ? a : b;
		while(true) {
			if(ans % a == 0 && ans % b == 0){
				System.out.println("LCM is = " + ans);
				break;
			}
			ans += 1;
		}

	}
}