import java.util.Scanner;

class Prog5 {

	public static void main(String[] args) {
		
		for(int j = 1; j <= 4; j++) 
	    { 
	          
	    	int c = 1;
	    	for(int i = 1; i <= j; i++) 
	    	{  
	        	System.out.print(c + " "); 
	        	c = c * (j - i) / i;  
	    	} 
	    	System.out.println(); 
	    } 
	}
}