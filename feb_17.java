package assign4th;
import java.util.*;
//1. Write a program to check for lower triangular matrix
public class feb_17 {

	public class LowerTriangularMatrix
	{
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the size of the matrix: ");
	        int n = in.nextInt();
	        
	        int arr[][] = new int[n][n];
	        
	        System.out.println("Enter elements of the matrix: ");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter Row "+ (i+1) + " :");
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = in.nextInt();
	            }
	        }
	        
	        System.out.println("The Matrix is:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        
	        boolean isTriangular = true;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if ((i < j && arr[i][j] != 0)
	                     || (i >= j && arr[i][j] == 0)) {
	                    isTriangular = false;
	                    break;
	                }
	            }
	            
	            if (!isTriangular) {
	                break;
	            }
	        }
	        
	        if (isTriangular) {
	            System.out.println("The Matrix is Lower Triangular");
	        }
	        else {
	            System.out.println("The Matrix is not Lower Triangular");
	        }
	    }
	}
//2. Find the sum of diagonal elements of a matrix
	 public class Diagonal
	 {
	   public static void main (String[]args)
	   {
	     Scanner input = new Scanner(System.in);
	     System.out.println("Enter the size of the square matrix:");
	     int size = input.nextInt(), lsum =0, rsum =0;
	     int [][]a = new int [size][size];
	      for (int i=0; i<size; i++)
	     {
	       for (int j=0; j<size;j++)
	       {
	         a[i][j] = input.nextInt();
	       }
	     }
	     for (int i=0; i<size; i++)
	     {
	       for (int j=0; j<size;j++)
	       {
	         if (i==j)
	           lsum = lsum + a[i][j];
	          
	         else if ((i+j)==(size-1))
	          rsum = rsum + a[i][j];
	          
	         else
	           continue;
	       }
	     }
	     System.out.println ("Diagonal Sum= "+lsum);                    
	   }
	 }
//3.Check whether the matrix is sparse
	 public class sparse 
	 { 
	     public static void main(String[] args) 
	     { 
	         int m, n;  
	         Scanner sc = new Scanner(System.in); 
	         System.out.println("Enter the number of rows ");   
	         m = sc.nextInt();   
	         System.out.println("Enter the number of columns ");  
	         n = sc.nextInt();   
	         int a[][] = new int[m][n];   
	         System.out.println("Enter all the values of matrix "); 
	         for (int i = 0; i < m; i++) 
	         { 
	             for (int j = 0; j < n; j++) 
	             { 
	                 a[i][j] = sc.nextInt();                 
	             } 
	         }    
	         System.out.println("Original Matrix:"); 
	         for (int i = 0; i < m; i++) 
	         { 
	             for (int j = 0; j < n; j++) 
	             { 
	                     System.out.print(a[i][j] + " "); 
	             } 
	             System.out.println(""); 
	         } 
	         int size= m*n;  
	         int count=0;        
	         for(int i = 0; i < m; i++)
	         {    
	             for(int j = 0; j < n; j++)
	             {    
	                 if(a[i][j] == 0)  
	                     count++;   
	             }    
	         }        
	         if(count>(size/2))
	         System.out.println("It is a sparse matrix");
	         else
	         System.out.println("It is not a sparse matrix");           
	     } 
	 }
}
