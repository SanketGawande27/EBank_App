package operation_interface;


import java.util.ArrayList;
import java.util.Scanner;

import MyCustomException.ValidationExceptions;
import MyCustomException.InvalidAccountException;
import driver.Account;

public class AccountUtils implements Operations {
   Scanner sc = new Scanner(System.in);
  ArrayList<Account> accounts = new ArrayList<Account>();
 Account acc = new Account();
	
   
    
	@Override
	public void addAccount() throws ValidationExceptions {
		
		System.out.println("Enter your Bank Account Details");
		
		System.out.print("Enter Bank Account Number");
		int accountno = sc.nextInt();
		System.out.print("Enter Name");
		String name = sc.next();
		if(name.length()<5) {
			throw new ValidationExceptions("Name Must be 5 Characters Long");
		}
		System.out.print("Enter Email");
		String email = sc.next();
		for(int i=0;i<email.length();i++) {
			char ch = email.charAt(i);
			if(ch =='@') {
				
			}else {
				throw new ValidationExceptions("Invalid EmailID....\nTry Again...!");
			}
		}
		System.out.print("Enter Phone Number");
		long phoneno = sc.nextLong();
		System.out.print("Enter Balance");
		double balance = sc.nextDouble();
		Account acc = new Account(accountno, name, email, phoneno, balance);
		accounts.add(acc);
	
		
	}

	@Override
	public void displayAccount() throws InvalidAccountException {
		System.out.println("Enter Account No");
		long accno = sc.nextInt();
		for(Account c : accounts) {
		if( c.getAccNumber() == accno) {
			System.out.println(c);
		}else {
			throw new InvalidAccountException("Your Account Number is not match to any account NO.... !!\n Try Again.. ");
		}
	}
	}

	@Override
	public void displayAllAccount() {
		for(Account c : accounts) {
			System.out.println(c);
		}
		
		//System.out.println(accounts);
	}

	@Override
	public void removeAccount() throws InvalidAccountException {
		
		System.out.println("Enter Account No To Delete");
		long accno = sc.nextInt();
		for(Account c : accounts) {
		if( c.getAccNumber() == accno) {
			accounts.remove(c);
			System.out.println("Account is Deleted Successfully");
		}else {
			throw new InvalidAccountException("Your Account Number is not match to any account NO.... !!\n Try Again.. ");
		}
	}
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchAccount_name() throws ValidationExceptions  {
		System.out.println("Enter Name for Sreach Account");
		String searchName = sc.next();
		for(Account c : accounts) {
		if( c.getName().equals(searchName)) {
			System.out.println(c);
		}else {
			throw new ValidationExceptions("Account Not Found....\n SearchName is Not Found in Accounts ");
		}
	}
		
	}

	@Override
	public void searchAccount_phone() {
		System.out.println("Enter Phone No for Search account");
		long phoneNo = sc.nextLong();
		for(Account c : accounts) {
		if( c.getPhone() == phoneNo) {
			System.out.println(c);
		}
	}
		
	}

	@Override
	public void searchAccount_email() {
		System.out.println("Enter EmailId for Sreach Your Account");
		String searchEmail = sc.next();
		for(Account c : accounts) {
		if( c.getEmail().equals(searchEmail)) {
			System.out.println(c);
		}
	}
		
	}


	
	
	
	public static void main(String[] args) {
		

	}
}
