class Ant {

	int life;
	String color;

	Ant(int life,  String color) {
		this.life = life;
		this.color = color;
	}
}

class Colony {

	Ant a1 = new Ant(1, "Red");
	Ant a2 = new Ant(5, "Black");
	Ant a3 = new Ant(10, "Black");
	Ant a4 = new Ant(15, "Black");
	Ant a5 = new Ant(20, "Red");

	Ant arr[] = {a1, a2, a3, a4, a5};
	
	public static void main(String[] args) {
		
		Colony obj = new Colony();
		for (int i = 0; i < 5; i++) {
			System.out.println(obj.arr[i]);		
		}	
	}
}