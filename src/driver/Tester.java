package driver;

import java.util.Scanner;

import MyCustomException.ValidationExceptions;
import MyCustomException.AccountNotFoundException;
import MyCustomException.InvalidAccountException;

//import com.assignment.queue.service.impl.Myqueue;

import operation_interface.AccountUtils;

public class Tester {

	public static void main(String[] args) throws AccountNotFoundException, InvalidAccountException {
		Scanner sc = new Scanner(System.in);
		AccountUtils accu = new AccountUtils();
		//Account acc = new Account();
		
		boolean boolean_condition = true; 
		
		
		while(boolean_condition) {
		System.out.println("**********************************************");
		System.out.println("           Welcome to EBank                   ");
		System.out.println("Press\n1 for Add Account\n2 for Display an Account\n3 for Display all Account\n4 for Remove an Account\n5 for Withdraw"
				+ "\n6 for Deposit\n7 for Transfer\n8 for Search account using name \n9 for Search account using phone\n10 for Search account using email\n11 for Exit");
		int chice = sc.nextInt();
		switch(chice) {
		
		case 1:
			try {
			accu.addAccount();
			System.out.println("Account is Added Successfully");
			}catch (ValidationExceptions e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 2:
			try {
			accu.displayAccount();
			}catch (InvalidAccountException e) {
				System.out.println(e.getMessage());
			}
			
			break;
		
		case 3:
			System.out.println("All Account Info...");
			accu.displayAllAccount();
			System.out.println("_______________________________________________");
			break;
			
		case 4:
			accu.removeAccount();
			break;
			
		case 5:
			break;
			
		case 6:
			break;
			
		case 7:
			break;
			
		case 8:
			try {
			accu.searchAccount_name();
			}catch (ValidationExceptions e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 9:
			accu.searchAccount_phone();
			break;
			
		case 10:
			accu.searchAccount_email();
			break;
			
		case 11:
			boolean_condition = false;
			break;
			
			default:
				System.out.println("Please chooce proper option");
		
		}
		
		}
		
	}

}
