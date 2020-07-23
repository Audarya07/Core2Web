class SizeJava {
	
	public static void main(String[] args) {
		
		System.out.println(Byte.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Integer.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Double.SIZE/8);
		System.out.println(Character.SIZE/8);
		//System.out.println(Boolean.SIZE/8);	Gives ERROR as Boolean doen not have SIZE..It is JVM Dependent
	}
}
