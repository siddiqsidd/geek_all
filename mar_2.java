package hmw;
import java.lang.*;
import java.util.*;
public class mar_2 {
//1.) Truncate Sentence You are given a sentence s and an integer k. 
//You want to truncate s such that it contains only the first k words. 
//Return s after truncating it.
// Input: s = ""Hello how are you Contestant"", k = 4 
//Output: ""Hello how are you""
		public static void main(String[] args) {
		    System.out.println(truncateKSentence("Hello how are you Contestant",4));
	    }
	public static String truncateKSentence(String str, int k) {
			String[] strArray=str.split(" ");
			String output="";
			for(int i=0;i<k;i++) {
				output+=strArray[i]+" ";
			}
			return output;
		}
//2.How Many Numbers Are Smaller Than the Current Number
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
//That is, for each nums[i] you have to count the number of valid j's such that j != i . 
//Return the answer in an array.
	public class Rextester
	{  
	    public static int[] smallerNumbersThanCurrent(int[] nums) 
	    {
	        int[]ans=new int[nums.length];
	        for(int i=0;i<nums.length;i++)
	        {
	            int count=0;
	            for(int j=0;j<nums.length;j++)
	            {
	                if(nums[i]>nums[j])   count++;
	            }
	            ans[i]=count;
	        }
	        return ans;
	    }
	    
	    public static void main(String args[])
	    {
	       int[]nums={8,1,2,2,3};  
	       int[]ans=smallerNumbersThanCurrent(nums);
	        
	       for(int num:ans)  
	       {
	           System.out.print(num+" ");
	       }
	        
	    }
	}
//3.Check if given String is valid. String is valid if Characters in given string have at least 1 uppercase, 
	//1 lowercase and 1 digit.
	public static void main(String[] args) {
	    System.out.println(isValidString("Hello1"));
	}
	public static String isValidString(String str) {
		boolean isUpper = false, isLower = false, isDigit = false;
		for (char ch : str.toCharArray()) {
			if (ch >= 'A' && ch <= 'Z' && !isUpper) {
				isUpper = true;
			} else if (ch >= 'a' && ch <= 'z' && !isLower) {
				isLower = true;
			} else if (ch >= '0' && ch <= '9' && !isDigit) {
				isDigit = true;
			}
		}
		return (isUpper && isLower && isDigit) ? "Valid" : "InValid";
	}
	

	}


	

