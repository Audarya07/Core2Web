class Core2Web {
	
	static class Management {
		
		static int members = 40;
		void organizeAdmissions() {
			members += 1;
			System.out.println(members);
		}
	}
	
	public static void main(String[] args) {
		
		new Management().organizeAdmissions();
	}
}

// 41
