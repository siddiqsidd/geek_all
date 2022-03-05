package hmw;
import java.lang.StringBuffer;
import java.util.*;
public class mar_1 {
	//1.Write a program to replace a given substring in a sentence with another string. 
	//For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, 
	//the new sentence should be printed as ”A snowman with snow”. 

	public class StringReplaceEmp {
		public static void main(String args[]) {
			String str="A batman with bat";
			System.out.println( str.replaceAll("bat", "snow") );
		}
	}
	//2.WAP to tOGGLE each word in the String? 
	public class toggle{
		   public static void main(String args[]){
		      String sample = "This is Geekster";
		      String[] words = sample.split(" ");
		      String result = "";
		      for(String word:words){
		         String firstSub = word.substring(0, 1);
		         String secondSub = word.substring(1);
		         result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";
		      }
		      System.out.println(result);
		   }
		}
	//3. WAP to reverse tOGGLE each word in the String?
	public class ToggleReverse {
	   public static void main(String args[]){
	      String sample = "Hello How are you";
	      String[] words = sample.split(" ");
	      String result = "";
	      for(String word:words){
	         StringBuffer s = new StringBuffer(word);
	         word = s.reverse().toString();
	         String firstSub = word.substring(0, 1);
	         String secondSub = word.substring(1);
	         result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";
	      }
	      System.out.println(result);
	   }
	}
}
