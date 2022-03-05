package f7;
import java.util.*;
//1.make an array with user inputs of size 10. , then find sum of all elements in array

import java.util.Scanner;
public class feb_9 {
	
	    public static void main(String[] args) 
	    {
	        int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println("Sum:"+sum);
	    }
}
//2.make an array with user inputs of size 10. , then find midle element in an array
public class Median 
{
   public static void main(String args[]) 
    { 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number"); 
	int a=sc.nextInt();
	double[] input=new double[a];
	System.out.println("enter "+a+" elements");
	for(int i=0;i<a;i++) 
	{
		input[i]=sc.nextDouble();
		
	}
	double res=medianCal(a,input);
	 System.out.println("Median :"+res);  
   
    }
static double medianCal(int  n,double in[])
{
	double m=0;	
	
	if(n%2==1)
	{
		m=in[((n+1)/2)-1];
		
	}
	else
	{
		m=(in[n/2-1]+in[n/2])/2;
		
	}
return m;
	
 }
}
//3.make an array with user inputs of size 10. then print all positive numbers in an array"
//import java.util.Scanner;

public class PositiveArray {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int size, i;
		
		sc = new Scanner(System.in);		
		System.out.print("\nPlease Enter the PS Array size  : ");
		size = sc.nextInt();
		int[] ps_arr = new int[size];
		
		System.out.format("\nEnter PS Array %d elements : ", size);
		for(i = 0; i < size; i++) 
		{
			ps_arr[i] = sc.nextInt();
		}
		
		PositiveElement(ps_arr, size);
	}
	public static void PositiveElement(int[] ps_arr, int size ) {
		int i;
		
		System.out.print("\nList of Positive Numbers in PS Array : ");
		for(i = 0; i < size; i++) 
		{
			if(ps_arr[i] >= 0) {
				System.out.format("%d  ", ps_arr[i]);
			}
		}
	}
}
