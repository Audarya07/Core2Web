import java.util.Scanner;

class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String arr[] = new String[]{"Bobby", "Lilly", "Arjun", "Priti"};
		
		System.out.println("Find: ");
		String find = sc.nextLine();
		
		System.out.println("Replace: ");
		String rep = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(find)){
				arr[i] = rep;
			}
		}
		System.out.print("Result array:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}