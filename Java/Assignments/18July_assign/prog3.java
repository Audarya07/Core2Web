class Main {

	public static void main(String[] args) {
	
		int i = 5, j = 4;
		boolean ans1, ans2;

		ans1 = (i++ >= j++) && (--j < i++);	//(5 >= 4) && (4 < 6) = (true) && (true) = true
		System.out.println("ans1 = " + ans1);	//true
		System.out.println("i = " + i);		//7
		System.out.println("j = " + j);		//4
		
		i = 5;
		j = 4;
		ans2 = (--i < j--) || (j++ >= ++i);	//(4 < 4) || (3 >= 5) = (false) || (false) = false
		System.out.println("ans2 = " + ans2);	//false
		System.out.println("i = " + i);		//5
		System.out.println("j = " + j);		//4
	}
}
