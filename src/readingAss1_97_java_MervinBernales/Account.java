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
	private Date dateCreated = new java.util.Date();
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
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
	    annualInterestRate = _AnnualInterestRate/100;
	}
	public Date getDateCreated() {
	    return dateCreated ;
	}
	public double getMonthlyInterestRate() {
	    return annualInterestRate/12;
	}
	public double getMonthlyInterest(){
		return (annualInterestRate/12)*balance;
	}
	public double withdraw(double amount) {
	    return balance = balance - amount;
	}
	public double deposit(double amount) {
	    return balance = balance + amount;   
	}
}
