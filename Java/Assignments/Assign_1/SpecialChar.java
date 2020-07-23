class SpecialChar {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
	}
}

/*
 * 1. The Symbols ! @  $ % ^ - _ = + [ ] { } : , . ? / are allowed as command line args.
 
 * 2. The symbol * gives the directory contents. The number of contents depends on the position number on which it is written.
 * 	Ex. Here, there are 4 Sop's ..so if * is written as the 1st and only argument then it prints 4 dir contents.
 * 				    ..so if * is written as the 3rd argument the it prints only 2 dir contents.
 
 * 3. The symbols #  (  ) ;   gives error.
 
 * 4. The symbol & converts the cuurent process(our java program) to run in the background.
 
 * 5. The symbols < and > are considered as "newline" token and gives error.
 
 * 6. The symbol ~ (tilde) prints the home dir.
 
 * 7. The symbols | and \  ask for more arguments and do not end the program.(Not sure what it means).
 *
 *
 *
 * Any symbol except \ and | can be printed if we write it inside single or double quotes.
 
 */

