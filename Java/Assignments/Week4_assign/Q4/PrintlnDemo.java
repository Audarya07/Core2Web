class PrintlnDemo {
	
	public static void main(String[] args) {
		
		System.out.print("Welcome");
		System.out.println("Hello");
		System.out.println("Hi");

	}
}

/*Output:
WelcomeHello
Hi
*/


/*
 
-------System.out.print(".....")--------------
-> It does not have a "nextline"(\n) escape sequence at the end of the print statement.
-> 1 parameter is compulsory.


-------System.out.println(".....")----------- 
-> It has a "nextline"(\n) escape sequence at the end of print statement. The next statement is printed on next line.
-> The println() method can also be used without parameters, to position the cursor on the next line.

*/
