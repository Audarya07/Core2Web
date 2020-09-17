class Prog2 {

	public static void main(String[] args) {
		
		int m;
		for(int i = 5; i >= 1; i--){

            for(m = 1; m < i; m++)
                    System.out.print("  ");
            for(int j = m; j <= 5; j++){
                    System.out.print(((j+i)%2==0) ? "0 " : "1 " );
            }
            System.out.println();
        }
	}
}