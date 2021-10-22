package driver;

import java.util.Scanner;


public class Account {
   
	long accNumber;
	String name;
	String email;
	long phone;
	double balance;
	
	
	
	public Account(long accNumber, String name, String email, long phone, double balance) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}
	
		
	}
	

