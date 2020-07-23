class Float {
	
	public static void main(String[] args) {
		
		//float a = 20.5;
		//System.out.println(a);	ERROR: Considers it as double 

		float a = 20.6f;
		System.out.println("a = "+a);
		double b = 20.6;		
		System.out.println("b = "+b);

		if(a == b)
			System.out.println("a and b are Same");
		else
			System.out.println("a and b are Different");

		float c = 20.5f;
		System.out.println("c = "+c);
		double d = 20.5;		
		System.out.println("d = "+d);

		if(c == d)
			System.out.println("c and d are Same");
		else
			System.out.println("c and d are Different");

	}
}
