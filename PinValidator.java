package util;
import banking.BankingSystem;
public class PinValidator{

public class Rules{

	public boolean isValid(String Pin){
		if (Pin.length()==4 && Pin.matches("\\d+")&&Pin.equals(BankingSystem.storedPin)){
		return true;
	}
	else{
		return false;
		}

	       }

	}




}