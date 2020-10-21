class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Audarya");
		StringBuffer sb2 = new StringBuffer("Instazen");

		System.out.println(sb1);
		
		//length
		System.out.println(sb1.length());

		//capacity
		System.out.println(sb1.capacity());

		//append
		System.out.println(sb1.append("Uttarwar"));
		System.out.println(sb1.append(20));
		System.out.println(sb1.append(sb2));

		//insert
		System.out.println(sb1.insert(7,"Girish"));

		//deleteChatAt
		System.out.println(sb1.deleteCharAt(22));

		//delete
		System.out.println(sb1.delete(21,30));

		//reverse
		System.out.println(sb1.reverse());

		sb1.reverse();

		//setLength
		sb1.setLength(7);
		System.out.println(sb1);
	}
}