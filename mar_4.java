package hmw;

//public class mar_4 {
//2. Solve MCQs from https://www.javaguides.net/2020/04/java-oops-quiz-coding-programs.html"
	/*
	 * 1q) B. Driving electric car
2q) B. public and protected both can be used.
3q) a.
	Base
	Derived
	DeriDerived
4q) b. Removing Stmt-1 will make the program compilable and it will print the following: Base: Hello Derived.
    c. Removing Stmt-2 will make the program compilable and it will print the following: Base Derived.
    d. Removing both Stmt-1 and Stmt-2 will make the program compilable and it will print the following:
     Base Derived.
5q) C. 13245
6q) A. 2
7q) d. int
	 */
//1. Create Bank account array and display details of all Account holders, and also accept 
//user input to create account object 
	import java.util.Scanner;  
	class BankDetails {  
	    private String accno;  
	    private String name;  
	    private String acc_type;  
	    private long balance;  
	    Scanner sc = new Scanner(System.in);  
	    public void openAccount() {  
	        System.out.print("Enter Account No: ");  
	        accno = sc.next();  
	        System.out.print("Enter Account type: ");  
	        acc_type = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();  
	        System.out.print("Enter Balance: ");  
	        balance = sc.nextLong();  
	    }  
	    public void showAccount() {  
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account no.: " + accno);  
	        System.out.println("Account type: " + acc_type);  
	        System.out.println("Balance: " + balance);  
	    }  
	    public void deposit() {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt;  
	    }  
	    public void withdrawal() {  
	        long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  
	    //method to search an account number  
	    public boolean search(String ac_no) {  
	        if (accno.equals(ac_no)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	    }  
	}  
	public class mar_4 {  
	    public static void main(String arg[]) {  
	        Scanner sc = new Scanner(System.in);  
	        //create initial accounts  
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        BankDetails C[] = new BankDetails[n];  
	        for (int i = 0; i < C.length; i++) {  
	            C[i] = new BankDetails();  
	            C[i].openAccount();  
	        }  
	        int ch;  
	        do {  
	            System.out.println("\n bank account details");  
	            System.out.println("1. Display all account details \n 2. Deposit the amount \n 3. Withdraw the amount \n 4.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                        for (int i = 0; i < C.length; i++) {  
	                            C[i].showAccount();  
	                        }  
	                        break;                     
	                    case 2:  
	                        System.out.print("Enter Account no. : ");  
	                        String ac_no = sc.next();  
	                        boolean found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].deposit();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 3:  
	                        System.out.print("Enter Account No : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].withdrawal();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 4:  
	                        System.out.println("See you soon...");  
	                        break;  
	                }  
	            }  
	            while (ch != 4);  
	        }  
	    }  
//}
