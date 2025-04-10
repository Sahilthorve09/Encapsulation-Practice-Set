
public class BankAccount {

	private int accNo;
	private String name;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			this.balance = balance + amount;
			System.out.println("Amount deposited: " + amount);
			System.out.println("Total Balance: " + balance);
		} else {
			System.out.println("Plz enter valid amount");
		}
		System.out.println("----------- Thank You Visit Again -----------");
	}

	public void withdraw(double wAmount) {
		if (this.balance >= wAmount && wAmount > 0) {
			this.balance = balance - wAmount;
			System.out.println("Withdraw Amount is: " + wAmount);
			System.out.println("Remaining Balance: " + balance);
		} else {
			System.out.println("Enter Valid Amount Insufficent Balance:  "+balance);
		}
	}

}
