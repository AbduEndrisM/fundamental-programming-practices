package lesson12.problem1;

import java.util.Scanner;

public class CustomerAccount {
	private String Cus_name;
	private String Acc_No;
	private double Balance;
 
	CustomerAccount(String Cus_name, String Acc_No, double Balance) {
		this.Cus_name = Cus_name;
		this.Acc_No = Acc_No;
		this.Balance = Balance;
	}

	public String getCus_name() {
		return Cus_name;
	}

	public void setCus_name(String cus_name) {
		Cus_name = cus_name;
	}

	public String getAcc_No() {
		return Acc_No;
	}

	public void setAcc_No(String acc_No) {
		Acc_No = acc_No;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void deposit(double deposit) {

		Balance = getBalance() + deposit;

	}

	public void Withdraw(double Withdraw) {
		double temp = getBalance() - Withdraw;
		try {
			if (temp < 100)
				throw new MyExceptions("Withdraw amount exceed the balance");
			this.Balance = temp;
			System.out.println("You can do your withdrowal");
		} catch (MyExceptions e) {
			System.out.println("your balance is below 100");
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Plases enter the cash you wont to withdrow ");
		double Withdraw = in.nextDouble();

		CustomerAccount cust = new CustomerAccount("selam", "11-45", 500);

		cust.Withdraw(Withdraw);

	}

	public class MyExceptions extends Exception {
		MyExceptions() {
			super();
		}

		MyExceptions(String str) {
			super(str);
		}
	}
}
