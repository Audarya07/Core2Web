import java.io.*;
import java.util.*;

class Prog4 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = (br.readLine()).toLowerCase();
		String s2 = br.readLine().toUpperCase();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr2);
		Arrays.sort(arr1);

		int flag = 0;

		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				if((arr1[i] != arr2[i] + 32) && arr1[i] != arr2[i] - 32) {
					flag = 1;
					System.out.println("String is not anagram");
					break;
				}
			}
		}	
		if(flag == 0)
			System.out.println("String is anagram");
	}
}