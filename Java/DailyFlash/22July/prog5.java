class Amazon {

	public static void main(String[] args) {

		Amazon alexa = new Amazon();
		Amazon echo = new Amazon();
		boolean isAlexa = alexa instanceof Amazon;
		boolean isEcho = echo instanceof Amazon;
		System.out.println("Is alexa product of Amazon = " + isAlexa);
		System.out.println("Is echo product of Amazon = " + isEcho);
		System.out.println("-------------------------------------------");
		Amazon GCP = null;
		Amazon jioSavan = null;
		boolean isGCP = GCP instanceof Amazon;
		boolean isJioSavan = jioSavan instanceof Amazon;
		System.out.println("Is GCP part of Amazon = " + isGCP);
		System.out.println("Is jioSavan part of Amazon = " + isJioSavan);
	}
}
