package one.one;

public class One {
public static void main(String[] args) {
	int[] nums = {2,4,3,8,10,11,14,16,17,20};
  
	for(int i=0;i<nums.length;i=i+2)
		System.out.println("Even Index Number "+i +":  "+ nums[i]);
  
	for(int i=0;i<nums.length;i++)
		if(nums[i]%2==0)
		System.out.println("Even numbers "+ nums[i]);
  
	
	// using ternary operator 
	for(int i=0;i<nums.length;i++) {
		System.out.println("Number: "+ nums[i]+"->"+ (nums[i]%2==0?"Even":"Odd"));
		//System.out.println(nums[i]%2==0?"Even":"Odd");
	}


	
	
		Employee a = new Employee("Alice");
		Employee b = new Employee("Bob");
		swap(a,b);
		System.out.println(a+" "+b);
		
	int num = 50;
	triple(num);

	System.out.println(num);
	
	
}

	private static void swap(Employee x, Employee y) {
	// 
		Employee temp = x;
		 x = y;
			 y = temp;
	
}

	public static void triple(int x) {
		x = 3 * x;
	}
}

class Employee {
	String x;

	Employee(String x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Employee [x=" + x + "]";
	}
	
	

			
}
