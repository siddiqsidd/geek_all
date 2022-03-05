package f7;
import java.util.*;
//1.1.WAP to reverse an array	
public class feb_10 {  
	    public static void main(String[] args) {  
	        int [] arr = new int [] {1, 2, 3, 4, 5};  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	} 
}
//2.2.Given a random set of numbers, Print them in sorted order.
//import java.util.*;
public class ArrayInOrder {
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array ::");
	   
	      for(int i = 0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }

	      for(int i = 0; i<size-1; i++) {
	         for (int j = i+1; j<myArray.length; j++) {
	            if(myArray[i] > myArray[j]) {
	               int temp = myArray[i];
	               myArray[i] = myArray[j];
	               myArray[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(myArray));
	   }
	}
//3.WAP to find first index at which element is present in array 
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 7, 3, 2, 8}; 
        int element = 2;
        int index = -1;
         
        int i = 0;
        while(i < numbers.length) {
            if(numbers[i] == element) {
                index = i;
                break;
            }
            i++;
        }
         
        System.out.println("Index of "+element+" is : "+index);
    }
}
//3. WAP to find first index at which element is present in array 
//4. WAP to find last index at which element is present in array "
public class indexarray
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int size=a.length;
System.out.println("First element of an array is"+a[0]);
System.out.println("Last element of an array is "+a[size-1]);
}
}