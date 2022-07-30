package PracticeProject23;

public class Matrix {
	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		int[][] firstMatrix = { { 1, -1, 1 }, { 2, 2, 2 } };
		int[][] secondMatrix = { { 2, 4 }, { 3, 6 }, { 4, 8 } };
		int[][] product = Matrix(firstMatrix, secondMatrix, r1, c1, c2);
		displayProduct(product);
	}

	public static int[][] Matrix (int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
		int[][] product = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		return product;
	}

	public static void displayProduct(int[][] product) {
		System.out.println("sum of two matrices is: ");
		for (int[] row : product) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}
}
