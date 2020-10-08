import java.util.*;

class Prog2 {

	public static void main(String[] args) {
		
		System.out.println("------Type 1--------");
		int[][] arr1 = {{1}, {2,3}, {4,5,6}};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("------Type 2-------");
		int[][] arr2 = new int[3][];
		arr2[0] = new int[]{10};
		arr2[1] = new int[]{20,30};
		arr2[2] = new int[]{40,50,60};

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("------Type 3-----");
		int[][] arr3 = {
					new int[]{100},
					new int[]{200,300},
					new int[]{400,500,600}
				};

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}		
	}
}