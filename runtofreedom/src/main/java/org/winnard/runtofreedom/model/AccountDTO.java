package org.winnard.runtofreedom.model;

public class AccountDTO {
	int userId;
	String userName;
	String password;
	String firstName;
	String lastName;
	double accountValue;
	double monthlySavings;
	
	public AccountDTO(){}
	
	public AccountDTO(int userId, String userName, String password, String firstName, String lastName,
			double accountValue, double monthlySavings) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountValue = accountValue;
		this.monthlySavings = monthlySavings;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getAccountValue() {
		return accountValue;
	}
	
	public void setAccountValue(double accountValue) {
		this.accountValue = accountValue;
	}
	
	public double getMonthlySavings() {
		return monthlySavings;
	}
	
	public void setMonthlySavings(double monthlySavings) {
		this.monthlySavings = monthlySavings;
	}
}
