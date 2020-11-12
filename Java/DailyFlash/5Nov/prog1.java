import java.io.*;

class Prog1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char arr[] = s.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i]);
		System.out.println();
	}
}