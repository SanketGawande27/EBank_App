package operation_interface;

import MyCustomException.ValidationExceptions;
import MyCustomException.InvalidAccountException;

interface Operations {
     public void addAccount() throws ValidationExceptions;
     public void displayAccount() throws InvalidAccountException;
     public void displayAllAccount();
     public void removeAccount() throws InvalidAccountException;
     public void withdraw();
     public void transfer();
     public void searchAccount_name() throws ValidationExceptions;
     public void searchAccount_phone();
     public void searchAccount_email();
     
}
