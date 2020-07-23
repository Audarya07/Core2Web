class Instagram {

	static boolean dispResult(Instagram user) {

		boolean ans;
		ans = user instanceof Instagram;
		return ans;
	}

	void dispInfo() {

		System.out.println("Joined Instagram !!");
	}
}

class Facebook {

	public static void main(String[] args) {

		Instagram profile = new Instagram();
		String ans;
		profile.dispInfo();
		ans = (Instagram.dispResult(profile)) ? "Yes" : "No";
		System.out.println(ans);
	}
}
