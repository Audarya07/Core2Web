import java.util.*;

class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter number of planes: ");
		int p = sc.nextInt();

		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();

		System.out.print("Enter number of cols: ");
		int c = sc.nextInt();

		System.out.println("Enter elements: ");
		int a[][][] = new int[p][r][c];
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0;k < c ; k++) {
					a[i][j][k] = sc.nextInt();
					sum += a[i][j][k];
				}
			}
		}
		System.out.println("Sum = " + sum);
	}
}