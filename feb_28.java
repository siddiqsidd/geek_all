package hmw;
import java.util.*;
//1.Take 10 integers from keyboard using loop and print their average value on the screen.
public class feb_28 {

	public class lowest{
	  public static void main(String[] args) {
	    int num; int den;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter numerator");
	    num = in.nextInt();
	    System.out.println("Enter denominator");
	    den = in.nextInt();
	    int a,b,gcd,t;
	    if(num>den){
	      a = num;
	      b = den;
	    }
	    else{
	      b = num;
	      a = den;
	    }
	    while (b != 0){
	      t = b;
	      b = a % b;
	      a = t;
	    }
	    gcd = a;
	    System.out.println("In lowest form = "+num/gcd+"/"+den/gcd);
	  }
	}
//2.Calculate the sum of digits of a number given by user. 
	public class SumOfDigitsExample1   
	{  
	public static void main(String args[])  
	{  
	int number, digit, sum = 0;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number: ");  
	number = sc.nextInt();  
	while(number > 0)  
	{  
	digit = number % 10;  
	sum = sum + digit;  
	number = number / 10;  
	}  
	System.out.println("Sum of Digits: "+sum);  
	}  
	} 
//3. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
	public class arms{
		  public static void main(String[] args) {
		    for(int i=1;i<=500;i++){
		      int sum = 0;
		      int t = i;
		      while(t!=0){
		        sum = sum+((t%10)*(t%10)*(t%10));
		        t = t/10;
		      }
		      if(sum==i){
		        System.out.println(i);
		      }
		    }
		  }
		}
//4.Write a program to print all prime number in between 1 to 100. in java
	class PrimeNumbers
	{
	   public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       String  primeNumbers = "";
	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println(primeNumbers);
	   }
	}
//5.Write a program to find prime factor of a number.
	//If a factor of a number is prime number then it is its prime factor.

	public class fctor{
	  public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);

	    

	    System.out.println("Enter the number");
	    int x = in.nextInt();

	    System.out.println("Prime factors of "+x+" are:");

	    for(int i=2;i<=x;i++){
	      if(x%i==0){
	        int p = 0;
	        for(int j=2;j<i;j++){
	          if(i%j==0){
	            p++;
	            break;
	          }
	        }
	        if(p==0){
	          System.out.println(i);
	        }
	      }
	    }
	  }
	}
//6.Write a program in java to find the sum of the even and odd digits of the number which is given as input.
	public class Sum_Odd_Even 
	{
	    public static void main(String[] args) 
	    {
	        int n, sumE = 0, sumO = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of elements in array:");
	        n = s.nextInt();
	        int[] a = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        for(int i = 0; i < n; i++)
	        {
	            if(a[i] % 2 == 0)
	            {
	                sumE = sumE + a[i];
	            }
	            else
	            {
	                sumO = sumO + a[i];
	            }
	        }
	        System.out.println("Sum of Even Numbers:"+sumE);
	        System.out.println("Sum of Odd Numbers:"+sumO);
	    }
	}
}
