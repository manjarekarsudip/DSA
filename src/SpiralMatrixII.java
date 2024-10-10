public class SpiralMatrixII {

	/*
	 * Given a positive integer n, generate an n x n matrix filled with elements
	 * from 1 to n2 in spiral order.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: n = 3 Output: [[1,2,3],[8,9,4],[7,6,5]] Example 2:
	 * 
	 * Input: n = 1 Output: [[1]]
	 * 
	 */

	public int[][] generateMatrix(int n) {

		int [][] ans = new int[n][n];
		
		int count = 1;
		int minRow = 0;
		int maxRow = n-1;
		int minCol = 0;
		int maxCol = n-1;
		
		while(count<=n*n) {
			for(int c= minCol; c<=maxCol; c++) {
				ans[minRow][c]=count;
				count++;
			}
			for(int r=minRow+1; r<=maxRow; r++) {
				ans[r][maxCol]=count;
				count++;
			}
			for(int c=maxCol-1; c>=minCol; c--) {
				ans[maxRow][c]=count;
				count++;
			}
			for(int r=maxRow-1; r>=minRow+1; r--) {
				ans[r][minCol]=count;
				count++;
			}
			minCol++;
			maxCol--;
			minRow++;
			maxRow--;
		}
		return ans;
    }
}
