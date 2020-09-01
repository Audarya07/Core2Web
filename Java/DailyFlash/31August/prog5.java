import java.io.*;

class Prog5 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int n=Integer.parseInt(br.readLine());
		
		for(int i=1;i<n;i++){
			if(n%i==0)
				System.out.print(i+" ");
		}

	}
}