package f7;
import java.util.*;
/*
 * 1. Reverse each word
 */

import java.util.*;
public class feb_7 {
	 public void reverseEachWordInString(String str1) {
	  String[] each_words = str1.split(" ");
	  String revString = "";
	  for (int i = 0; i < each_words.length; i++) {
	   String word = each_words[i];
	   String reverseWord = "";
	   for (int j = word.length() - 1; j >= 0; j--) {
	    reverseWord = reverseWord + word.charAt(j);
	   }
	   revString = revString + reverseWord + " ";
	  }
	  System.out.println(revString);
	 }
	 public static void main(String[] args) {
		 feb_7 obj = new feb_7();
	  String StrGiven = "word is beautifull";
	  System.out.println("The given string is: " + StrGiven);
	  System.out.println("The string reversed word by word is: ");
	  obj.reverseEachWordInString(StrGiven);
	 }
}
//2.Compress the string
class StringCompression{ 
    
    static void compression(char[] a, int n){ 
        
        int result = 0;
        
        for(int i=0; i<n; i++){ 
            int count = 1; 
            while(i<n-1 && a[i] == a[i+1]){ 
                count++; 
                i++; 
            } 
  
            if(count==1){
                result++;
            }
            else{
                result = result + 2;
            } 
        } 
        
        System.out.println(result);
    } 
  
    public static void main(String[] args){
        
        char[] a = {'a', 'a', 'a', 'b', 'b'}; 
        int n = a.length;
        
        compression(a, n); 
    } 
}
//3.Highest Occuring character
public class highest_occuring 
{
   public static void main(String[] args) 
   {    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
      int[] freq = new int[str.length()];    
      char maxChar = str.charAt(0);    
      int i, j, max;            
      char string[] = str.toCharArray();    
      for(i = 0; i < string.length; i++) 
	  {    
          freq[i] = 1;    
          for(j = i+1; j < string.length; j++) 
		  {    
              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') 
			  {    
                  freq[i]++;    
                      
                  string[j] = '0';    
              }    
          }    
      }    
       max = freq[0];    
      for(i = 0; i <freq.length; i++) 
	  {       
          if(max < freq[i]) 
		  {    
              max = freq[i];    
              maxChar = string[i];    
          }    
      }               
      System.out.println("Maximum occurring character: " + maxChar);    
  }  
}
//4.If strings are equal or not
public class equalOrnot {
	  public static void main(String[] args) {
	    String str1 = "Learn Java";
	    String str2 = "Learn Java";

	    boolean result = str1.equals(str2);

	    System.out.println(result);
	  }
}
//5.check permutation"
public class CheckPermutation{
	public static boolean isPermutation(String st1, String st2) {
		if (st1.length() != st2.length()) {
			return false;
		}

		int[] count = new int[256];
		for (int i = 0; i < st1.length(); ++i) {
			++count[st1.charAt(i)];
		}

		for (int i = 0; i < st2.length(); ++i) {
			if (--count[st2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string1: ");
		String st1=input.next();

		System.out.print("Enter string2: ");
		String st2=input.next();
		if(isPermutation(st1,st2)){
			System.out.println("Strings are permutations of each other.");
		}
		else{
			System.out.println("Strings are not permutations of each other.");
		}
	}
}
