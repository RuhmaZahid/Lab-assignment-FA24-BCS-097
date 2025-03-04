package main;
import java.io.Console;
import banking.BankingSystem;
public class BankApplication{
		
	public static void main (String args[]){
	Console console=System.console();

	if (console==null){
		System.out.println("can't open");

	}

	String AccountNumber=console.readLine("Enter Account Number:");
	String Pin=new String(console.readPassword("Enter Pin:"));


	boolean isAuthenticated = BankingSystem.LoginProcessor.authenticate(AccountNumber, Pin);

        if (isAuthenticated) {
            System.out.println("login successful");
        } 
	else {
            System.out.println("Invalid account number or pin");
        }

	}


}