class Core2Web {

	class Biencaps {

		static void fun() {
			System.out.println("In fun");
		}
	}
	public static void main(String[] args) {
		
		new Core2Web().new Biencaps().fun();
	}
}

// error: Illegal static declaration in inner class Core2Web.Biencaps                 
//               static void fun() {                                                              
//                           ^                                                                    
// modifier 'static' is only allowed in constant variable declarations 