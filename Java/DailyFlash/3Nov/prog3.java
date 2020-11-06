import java.util.Scanner;

class Prog3 {

	static boolean checkPalindrome(int n) {
		int temp = n;
		int rem;
		int revInt = 0;
		while(n != 0) {
            rem = n % 10;
            revInt = revInt * 10 + rem;
            n /= 10;
        }
        if (temp == revInt)
            return true;
        else
            return false;
	}

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre size of array: ");
		int num = sc.nextInt();

		int[] arr= new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter number " + (i+1) + ":");
			arr[i] = sc.nextInt();
			if(checkPalindrome(arr[i]))
				System.out.println("Number at index " + i + " is a palindrome!!");
			else
				System.out.println("Number at index " + i + " is NOT palindrome!!");

		}
	}
}