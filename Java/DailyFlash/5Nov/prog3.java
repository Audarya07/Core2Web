import java.io.*;
import java.util.*;

class Prog3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int flag = 0;

		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]){
				flag = 1;
				System.out.println("String is not anagram");
				break;
			}
		}
		if(flag == 0)
			System.out.println("String is anagram");
	}
}