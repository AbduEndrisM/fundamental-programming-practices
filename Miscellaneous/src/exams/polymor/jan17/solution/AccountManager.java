package exams.polymor.jan17.solution;

import java.util.ArrayList;
import java.util.List;

 
public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		//implement
		double sum=0.0;
		
		List<Account> l =new ArrayList<>();
		
		for(Employee e : emps) {
			l.addAll(e.getAccounts());
		}
			
		for(Account a:l)
			sum=sum+a.getBalance();
		
		return sum;
	}
}
