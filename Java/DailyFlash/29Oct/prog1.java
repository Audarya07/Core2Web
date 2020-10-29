class TV {

	void tvOn(boolean tvRemote) {
		System.out.println("Is the TV On => " + tvRemote);
	} 

	void tvOn(boolean tvRemote, boolean setupBox) {
		System.out.println("Is the TV On => " + (tvRemote && setupBox));
	}
}

class Prog1 {

	public static void main(String[] args) {
		
		TV obj = new TV();
		obj.tvOn(true);
		obj.tvOn(false);
		System.out.println("------------");
		obj.tvOn(true, false);
		obj.tvOn(true, true);
	}
}