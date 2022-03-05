package assign4th;
import java.util.*;
//1.Find the frequency of odd and even in given matrix
public class feb_16 {
	public class Frequency
	{
	    public static void main(String[] args) 
	    {
	        int p, q, count1 = 0, count2 = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of rows in matrix:");
	        p = s.nextInt();
	        System.out.print("Enter number of columns in matrix:");
	        q = s.nextInt();
	        int a[][] = new int[p][q];
	        System.out.println("Enter all the elements of matrix:");
	        for (int i = 0; i < p; i++) 
	        {
	            for (int j = 0; j < q; j++) 
	            {
	                a[i][j] = s.nextInt();
	            }
	        }
	        System.out.println("Given Matrix:");
	        for (int i = 0; i < p; i++) 
	        {
	            for (int j = 0; j < q; j++) 
	            {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println("");
	        }
	        for (int i = 0; i < p; i++) 
	        {
	            for (int j = 0; j < q; j++) 
	            {
	                if((a[i][j] % 2) == 0)
	                {
	                    count1++;
	                }
	                else
	                {
	                    count2++;
	                }
	            }
	        }
	        System.out.println("Even number frequency:"+count1);
	        System.out.println("Odd number frequency:"+count2);
	    }
	}

//2.Find the sum of anti diagonal elements in given matrix
 public class antiDiagonal
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
    System.out.println ("Right Diagonal Sum= "+rsum);                    
  }
}
//3.Display the string represented by each row of given matrix.
 public class printstring{
	    public static void main(String[] args){

	    printMatrixRow(new String[][] {{"Hello","Geekster"},
						       {"Good","Day"}});
	    }
	    public static void printMatrixRow(String[][] mat) {
			int row=0;
			for(String[] val:mat) {
				System.out.println("Row "+(row++)+" : "+String.join("",val));
			}
		}
	}
}