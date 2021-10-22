package MyCustomException;

public class InsufficentBalanceException extends Exception {
   public InsufficentBalanceException(String string) {
	   super(string);
   }
}
