import java.io.*;
class Prog4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int max = a;
		if(b > a && b > c)
			max = b;
		else if(c > a && c > b)
			max = c;
		System.out.println(max + " is the largerst number among " + a + " " + b + " " + c);
	}
}