class Core2Web {
	
	int members = 40;
	static class Management {
		
		void organizeAdmissions() {
			members += 1;
			System.out.println(members);
		}
	}
	
	public static void main(String[] args) {
		
		new Management().organizeAdmissions();
	}
}

// error: non-static variable members cannot be referenced from a static context      
//                         members += 1;                                                            
//                         ^             
