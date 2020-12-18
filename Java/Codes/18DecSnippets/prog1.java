class Core2Web {

	static int members = 40;
	
	void admissions() {
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

// 41