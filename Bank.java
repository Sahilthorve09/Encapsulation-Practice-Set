
public class Bank {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		acc.setAccNo(89084);
		acc.setName("Sahil Thorve");
		acc.setBalance(700.0);
		
		System.out.println("Account Number: "+acc.getAccNo());
		System.out.println("Account Holder Name: "+acc.getName());
		System.out.println("Blance: "+acc.getBalance());
		System.out.println("-------------------------------------------");
		
		acc.deposite(4000);
		
		System.out.println("------- Account Details -------");
		System.out.println("Account Number: "+acc.getAccNo());
		System.out.println("Account Holder Name: "+acc.getName());
		System.out.println("Blance: "+acc.getBalance());
		System.out.println("-------------------------------------------");
		
		acc.withdraw(500);
		
	}

}
