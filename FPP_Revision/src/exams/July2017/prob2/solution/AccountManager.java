package exams.July2017.prob2.solution;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		// implement
		double sum = 0.0;
		/*
		 * List<Account>list = new ArrayList<>(); for(Employee e:emps) {
		 * list.addAll(e.getAccounts()); }
		 * 
		 * 
		 * for (Account a:list) { sum+=a.getBalance(); }
		 */
		
		for (Employee e : emps) {
			for (Account a : e.getAccounts()) {
				sum = sum + a.getBalance();
			}

		}

		return sum;
	}

}