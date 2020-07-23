class Kutumb{
	int mob = 1;
	int laptop = 1;
	static int tv = 1;

	void shashiMethod(){
		System.out.println("Mob="+mob);
		System.out.println("Laptop="+laptop);
		System.out.println("Tv="+tv);
	}
	void vikasMethod(){
		System.out.println("Mob="+mob);
		System.out.println("Laptop="+laptop);
		System.out.println("Tv="+tv);
	}

	public static void main(String[] args){
		
		Kutumb shashi = new Kutumb();
		shashi.shashiMethod();
		shashi.mob = 0;
		shashi.shashiMethod();
		Kutumb vikas = new Kutumb();
		vikas.vikasMethod();

	}
}
