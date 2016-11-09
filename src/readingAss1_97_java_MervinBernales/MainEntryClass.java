package readingAss1_97_java_MervinBernales;
import java.util.Date;
public class MainEntryClass {
	public static void main(String[] args){
		Account account1 = new Account(1122, 20000, 4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
 		System.out.println("Balance:" + account1.getBalance());
 		System.out.println("Monthly Interest:" + account1.getMonthlyInterest());
 		System.out.println("Date Created:" + account1.getDateCreated());
	}
}
