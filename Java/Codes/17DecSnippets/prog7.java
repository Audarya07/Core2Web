class Core2Web {

	int members = 40;
	void admissions() {
		class Management {

			void organizeAdmissions() {
				System.out.println(members);
			}
		}
		new Management().organizeAdmissions();
	}
	
	public static void main(String[] args) {
		
		new Core2Web().admissions();
	}
}

// 40