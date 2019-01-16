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


}
}
