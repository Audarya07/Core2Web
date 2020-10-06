import java.io.*;

class Prog2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of planes: ");
		int p = Integer.parseInt(br.readLine());

		System.out.print("Enter number of rows: ");
		int r = Integer.parseInt(br.readLine());

		System.out.print("Enter number of cols: ");
		int c = Integer.parseInt(br.readLine());

		System.out.println("Enter elements: ");
		int a[][][] = new int[p][r][c];
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0;k < c ; k++) {
					a[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}

		System.out.println("-------------3-D form---------------");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0;k < c ; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}

		System.out.println("------------First plane------------");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < r; j++) {
					System.out.print(a[0][i][j] + " ");
			}
			System.out.println();
		}		

	}
}