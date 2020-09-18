class Prog3 {

	public static void main(String[] args) {
		
		int n = 1;
		int ans = n;
		for(int i = 1; i <= 4; i++){
			int flag = 0;
			for(int j = 1; j <= i; j++){
				while(true){
					if(n%2 != 0){
						flag = 1;
						break;
					}
					else
						n++;
				}
				ans = ans + n;
				if(flag == 1)
					n++;
              	System.out.print(ans + " ");
            }
      		System.out.println();
        }
	}
}