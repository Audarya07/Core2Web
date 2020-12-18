class Core2Web {
	
	int members = 40;
	static class Management {
		
		void organizeAdmissions() {
			System.out.println(new Core2Web().members);
		}
	}
	
	public static void main(String[] args) {
		
		new Management().organizeAdmissions();
	}
}

// 40
