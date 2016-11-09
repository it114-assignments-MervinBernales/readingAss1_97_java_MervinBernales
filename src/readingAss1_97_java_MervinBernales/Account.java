/**
 * 
 */
package readingAss1_97_java_MervinBernales;

import java.util.Date;

/**
 * @author Mervin
 *
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account(){}
	Account(int _Id, double _Balance) {
	    id = _Id;
	    balance = _Balance;
	}
	Account(int _Id, double _Balance, double _AnnualInterestRate) {
	    id = _Id;
	    balance = _Balance;
	    annualInterestRate = _AnnualInterestRate/100;
	}
	public int getId() {
	    return id;
	}
	public double getBalance() {
	    return balance;
	}
	public double getAnnualInterestRate() {
	    return annualInterestRate;
	}
	public void setId(int _Id) {
	    id = _Id;
	}
	public void setBalance(double _Balance) {
	    balance = _Balance;
	}
	public void setAnnualInterestRate(double _AnnualInterestRate) {
	    annualInterestRate = _AnnualInterestRate;
	}
	public Date setDateCreated() {
		java.util.Date dateCreated = new java.util.Date();
	    return dateCreated ;
	}
	double getMonthlyInterestRate() {
	    return annualInterestRate/12;
	}
	double getMonthlyInterest(){
		return (annualInterestRate/12)*balance;
	}
	double withdraw(double amount) {
	    return balance = balance - amount;
	}
	double deposit(double amount) {
	    return balance = balance + amount;   
	}
}
