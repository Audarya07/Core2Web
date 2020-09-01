import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int n=Integer.parseInt(br.readLine());

		for(int i=1;i<=n;i++){
			System.out.println("cube of "+i+" is "+i*i*i+" and  Square of "+i+" is  "+i*i);
		}
	}
}