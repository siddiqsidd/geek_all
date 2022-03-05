package assign4th;
import java.util.*;
//1.https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
public class feb_14 {

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int i=0;
		int count=0;
		while(i<startTime.length) {
			if(startTime[i]<=queryTime && endTime[i]>=queryTime) {
				count++;
			}
			i++;
		}
		return  count;
	}
	public static void main(String[] args) {
		System.out.println(busyStudent(new int[] {1,2,3},new int[] {3,2,7},4));
	}

//2.https://leetcode.com/problems/running-sum-of-1d-array/
public static int[] runningSum(int[] arr) {
	for(int i=1;i<arr.length;i++) {
		arr[i]+=arr[i-1];
	}
	return arr;
 }
public static void main(String[] args) {
	System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4})));
	
}
}
//3.
 public class Intersection {
     static  int i,j,k,c=0,w;
     public static void main(String[] args)
    {
    	 int[] x= {1, 2, 3, 4, 5, 6};
        for(int i=0;i<=x.length;i++)
        System.out.print(x[i]+"  ");
        System.out.println("");
        int[] y={2, 3, 4, 7, 8};
        System.out.println("The second array is " +"  ");
        for(int j=0;j<=y.length;j++)
        System.out.print(y[j]+"  ");
        System.out.println("");
        intersection(x,y);
    }
    
    
    static void intersection(int x[],int y[])
    {
        int []z=new int[x.length+y.length];
        for(i=0;i <(x.length);i++)
        {
            for(j=0;j < y.length;j++)
            {
                if(x[i]==y[j])
                {
                    z[c]=x[i];
                    
                    c++;
                }
              
                else
                continue;
                
            }
        }
        System.out.println("Intersection of two  array is " +"  ");
        for(k=0;k < c;k++)
        {
            System.out.print("  "+z[k]+" ");
        }
        System.out.println("            ");
    }
}
 //4.Write a program to find second largest element in a given Array in java?
 public class SecondLargest {
	 
	  public static void main(String[] args) {
	 
	    int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	    int largest = arr[0];
	    int secondLargest = arr[0];
	    
	    System.out.println("The given array is:" );
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }
	    for (int i = 0; i < arr.length; i++) {
	 
	      if (arr[i] > largest) {
	        secondLargest = largest;
	        largest = arr[i];
	 
	      } else if (arr[i] > secondLargest) {
	        secondLargest = arr[i];
	 
	      }
	    }
	 
	    System.out.println("\nSecond largest number is:" + secondLargest);
	 
	  }
}
