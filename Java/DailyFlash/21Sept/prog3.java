import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int yr = Integer.parseInt(br.readLine());
		if(((yr % 4 == 0) && (yr % 100 != 0) || yr % 400 == 0))
			System.out.println(yr + " is LEAP YEAR");
		else
			System.out.println(yr + " is not LEAP YEAR");
	}
}