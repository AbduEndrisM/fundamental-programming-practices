package exams.January2017.prob2.solution;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		// implement
		double sum = 0.0;
		for (Employee e : emps) {
			for (Account a : e.getAccounts()) {
				sum += a.getBalance();
			}
		}

		return sum;
		
		
		/*double sum2 = 0.0;
		List<Account> list = new ArrayList<>();
		
		
		for (Employee em : emps) {
			list.addAll(em.getAccounts());
		}
		for(Account l:list) {
			sum=sum+l.getBalance();
		}
		*/
		
	}
}
