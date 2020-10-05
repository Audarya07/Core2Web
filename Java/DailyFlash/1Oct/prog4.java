import java.io.*;

class Prog4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the total Over :");
		int over = Integer.parseInt(br.readLine());
		int ball = over * 6;

		int[] a = new int[ball];
		for(int i = 0; i < ball; i++){
			a[i] = Integer.parseInt(br.readLine());
		}

		int sum = 0, zerocnt = 0, nsix = 0, nfour = 0, totalother = 0;
		for(int i = 0; i < ball; i++){
			sum = sum + a[i];
			if(a[i] == 0)
				zerocnt++;
			if(a[i] == 4)
				nfour++;
			if(a[i] == 6)
				nsix++;
			else
				totalother += a[i];
		}

		System.out.println("Total Score :" + sum);
		System.out.println("Total Number of Ball :" + ball);
		System.out.println("Total numebr of six:" + nsix);
		System.out.println("Total number of four:" + nfour);
		System.out.println("Total number of dot ball  :" + zerocnt);
	}
}
