package banking;
import util.PinValidator;
public class BankingSystem{

	public static final String storedAccountNumber="abc1234";
 	public static final String storedPin="9876";

	public class LoginProcessor{

		public static boolean authenticate(String AccountNumber, String Pin){

		if (AccountNumber.equals(storedAccountNumber)&& new PinValidator().new Rules().isValid(Pin)){
		System.out.println("Account number and pin is correct.");
		return true;
		}

		else{
		System.out.println("Account and pin doesn't match!");
		return false;
		}

	}

   }

}