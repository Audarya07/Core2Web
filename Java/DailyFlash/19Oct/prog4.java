import java.util.Scanner;

class Prog4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int arr[] = new int[5];
		
		System.out.println("Enter elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Element to find: ");
		int var = sc.nextInt();

		int flag = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == var){
				System.out.print("Position : " + (i+1));
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 0)
			System.out.println("Not Found!!");
		
	}
}