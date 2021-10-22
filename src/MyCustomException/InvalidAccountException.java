package MyCustomException;

public class InvalidAccountException extends Exception {
	public InvalidAccountException(String string) {
		super(string);
	}
   
}
