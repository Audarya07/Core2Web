class Core2Web {
	
	static int members = 40;
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

// 41
