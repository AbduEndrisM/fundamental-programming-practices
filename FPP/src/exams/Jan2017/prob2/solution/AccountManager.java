package exams.Jan2017.prob2.solution;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		// implement
		double sum = 0.0;

		List<Account> accList = new ArrayList<>();
		for (Employee e : emps) {
			accList.addAll(e.getAccounts());

		}
		for (Account a : accList) {
			sum += a.getBalance();
		}
		return sum;

	}
}