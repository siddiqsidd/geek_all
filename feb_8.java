package f7;
import java.util.*;
//1. Write a method which returns a string by removing special charaters( &,$,:,+,@)
//spaces from the string
public class feb_8 {
	    public static void main(String args[]) { 
	        String text = "Geekster-The%school:where+you@code:your-success$stories"; 
	text = text.replaceAll("[^a-zA-Z0-9]", " ");
	System.out.println(text); 
    }
}
//2.WAP to prove that intern() method guarantees to return unique String from from a String pool
public class string_intern
{
    public static void main(String[] args) 
    {
        String str1 = new String("hello world");
        String str2 = "hello world";
        String str3 = "hello world";
        String str4 = str1.intern();
        System.out.println(str1 == str2);      
        System.out.println(str2 == str3);      
        System.out.println(str2 == str4);      
    }
}
//3.Write a method which accepts 10 digits mobile number as an Integer parameter and return a string 
//containing country code with mobile number.
public class mobile{  
public static void main(String args[]){  
double d=7890765456d;  
String s=String.format("%d",d);  
System.out.println("+91-"+s+"");  
}
}
//4. Write a method which accepts a String as a parameter and returns ratio of vowels to consonants in 
//String format
public class CountVowelConsonant {  
    public static void main(String[] args) {  
        int vCount = 0, cCount = 0;  
        String str = "We are Proud to be an India";  
         str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) {  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
                vCount++;  
            }  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                cCount++;  
            }  
        }  
        System.out.println(vCount+ ":"+cCount);   
    }  
} 

