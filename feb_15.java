package assign4th;
import java.util.*;
//1. add two 2D matrices to get the result matrix
public class feb_15 {
	public class MatrixAdditio{  
		public static void main(String args[]){      
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
		int c[][]=new int[3][3];     
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];   
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();    
		}    
		}
		}
//2.Given an M × N integer matrix, print it in spiral order
	public class spiral
	{
	    private static void printSpiralOrder(int[][] mat)
	    {   if (mat == null || mat.length == 0) {
	            return;
	        }
	        int top = 0, bottom = mat.length - 1;
	        int left = 0, right = mat[0].length - 1;
	 
	        while (true)
	        {
	            if (left > right) {
	                break;
	            }
	            for (int i = left; i <= right; i++) {
	                System.out.print(mat[top][i] + " ");
	            }
	            top++;
	 
	            if (top > bottom) {
	                break;
	            }
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(mat[i][right] + " ");
	            }
	            right--;
	 
	            if (left > right) {
	                break;
	            }
	            for (int i = right; i >= left; i--) {
	                System.out.print(mat[bottom][i] + " ");
	            }
	            bottom--;
	 
	            if (top > bottom) {
	                break;
	            }
	            for (int i = bottom; i >= top; i--) {
	                System.out.print(mat[i][left] + " ");
	            }
	            left++;
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        int[][] mat =
	        {
	            { 1, 2, 3, 4, 5},
	            {16, 17, 18, 19, 6},
	            {15, 24, 25, 20, 7},
	            {14, 23, 22, 21, 8},
	            {13, 12, 11, 10, 9}
	        };
	 
	        printSpiralOrder(mat);
	    }
	}
//3. Change all elements of row `i` and column `j` in a matrix to 0 if cell `(i, j)` is 0
	 
	class changig_elements
	{
	    public static void changeRowColumn(int[][] mat, int M, int N, int x, int y)
	    {
	        for (int j = 0; j < N; j++)
	        {
	            if (mat[x][j] != 0) {
	                mat[x][j] = -1;
	            }
	        }
	 
	        for (int i = 0; i < M; i++)
	        {
	            if (mat[i][y] != 0) {
	                mat[i][y] = -1;
	            }
	        }
	    }
	  public static void convert(int[][] mat)
	    {
	        if (mat == null || mat.length == 0) {
	            return;
	        }
	        int M = mat.length;
	        int N = mat[0].length;
	     for (int i = 0; i < M; i++)
	        {
	            for (int j = 0; j < N; j++)
	            {
	                if (mat[i][j] == 0)           
	                {
	                    changeRowColumn(mat, M, N, i, j);
	                }
	            }
	        }
	        for (int i = 0; i < M; i++)
	        {
	            for (int j = 0; j < N; j++)
	            {
	                if (mat[i][j] == -1) {
	                    mat[i][j] = 0;
	                }
	            }
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        int[][] mat =
	        {
	            { 1, 1, 0, 1, 1 },
	            { 1, 1, 1, 1, 1 },
	            { 1, 1, 0, 1, 1 },
	            { 1, 1, 1, 1, 1 },
	            { 0, 1, 1, 1, 1 }
	        };
	        convert(mat);
	        for (var r: mat) {
	            System.out.println(Arrays.toString(r));
	        }
	    }
	}
}
