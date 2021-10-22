package MyCustomException;

public class AccountNotFoundException extends Exception {
     public AccountNotFoundException(String string) {
    	 super(string);
     }
}
