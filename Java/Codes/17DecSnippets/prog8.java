class Core2Web {

	void admissions() {

		int members = 40;
		class Management {

			void organizeAdmissions() {
				members += 1;
				System.out.println(members);
			}
		}
		new Management().organizeAdmissions();
	}
	
	public static void main(String[] args) {
		
		new Core2Web().admissions();
	}
}

// error: local variables referenced from an inner class must be final or effectively 
// final                                                                                            
//                                 members += 1;                                                    
//                                 ^                