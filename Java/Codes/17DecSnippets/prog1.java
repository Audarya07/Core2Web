class Core2Web {

	class Biencaps {

		void fun() {
			System.out.println(this);
		}
	}
	public static void main(String[] args) {
		
		new Biencaps().fun();
	}
}

// error: non-static variable this cannot be referenced from a static context