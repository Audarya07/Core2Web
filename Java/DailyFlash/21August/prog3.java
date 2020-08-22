import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter (M/F) only : ");
		char sex = (char)br.read();

		int age = 27;
		System.out.println("Age : " + age);
			
		char status = 'Y';
		System.out.println("maritial status(Y/N) : " + status);
				
		if(sex == 'F')
			System.out.println("Can work only in Urban Areas");
		else if(sex == 'M' && (age >= 20 && age <= 40))
			System.out.println("Can work anywhere");
		else if(sex == 'M' && (age > 40 && age <= 60)){
			System.out.println("Can work in urban area only");
		}

	}
}