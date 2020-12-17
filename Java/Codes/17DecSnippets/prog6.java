class Core2Web {

	class Biencaps {

		static int a = 10;

		void fun() {
			System.out.println("In fun");
		}
	}
	public static void main(String[] args) {
		
		new Core2Web().new Biencaps().fun();
	}
}

// error: Illegal static declaration in inner class Core2Web.Biencaps                 
//               static int a = 10;                                                              
//                          ^                                                                    
// modifier 'static' is only allowed in constant variable declarations 