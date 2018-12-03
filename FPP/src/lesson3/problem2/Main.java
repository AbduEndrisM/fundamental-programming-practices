package lesson3.problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Abdu", "Abdu", 100000, 2010, 5, 12);

		Account checkingAcc = new Account(employee, AccountType.CHECKING, 300);
		Account savingAcc = new Account(employee, AccountType.SAVINGS, 300);
		Account retireAcc = new Account(employee, AccountType.RETIREMENT, 300);

		checkingAcc.makeDeposit(1800);
		savingAcc.makeDeposit(7000);
		retireAcc.makeDeposit(1000);

		checkingAcc.makeWithdrawal(1400);
		savingAcc.makeWithdrawal(1000);
		retireAcc.makeWithdrawal(1000);

		System.out.println(checkingAcc.toString());
		System.out.println(savingAcc.toString());
		System.out.println(retireAcc.toString());

	}

}
