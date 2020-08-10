// Precedence : &  >  ^  >  | 

class Prog2 {
	public static void main(String[] args) {
		
		int var = 8 & 6 ^ 4 | 12;
		System.out.println(var);
	}
}

/*
1000 = 8
  &
0110 = 6
----
0000 = 0
  ^ 
0100 = 4
----
0100 = 4
  |
1100 = 12
----
1100 = 12