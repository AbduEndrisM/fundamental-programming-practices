package lesson11; 
import java.util.*;
public class HashtableDemo3 {

	public static void main(String[] args) {
		 
		 Hashtable<Integer,Empl> tm = new Hashtable<Integer,Empl>();
		 tm.put(1, new Empl(134,"Ramu",3000));
		 tm.put(5, new Empl(235,"Jony",6000));
		 tm.put(3, new Empl(876,"Crish",2000));
		 tm.put(4, new Empl(512,"Tom",2400));
	        System.out.println("Hashtable entries:");
	      
	        Set<Integer> keys = tm.keySet();
	        System.out.println(keys);
	        System.out.println(tm.get(5).getName() + ": "+tm.get(5).getSalary());
	        
	        for(int key:keys){
	        //   System.out.println(key+" ==> "+tm.get(key));
	        }
      
		 
	        
	        Hashtable<String,Empl> tm2 = new Hashtable<String,Empl>();
			 tm2.put("Abdu", new Empl(134,"Ramu",3000));
			 tm2.put("Sobah", new Empl(235,"Jony",6000));
			 tm2.put("Elias", new Empl(876,"Crish",2000));
			 tm2.put("Aradom", new Empl(512,"Tom",2400));
		        System.out.println("Hashtable entries:");
		        
		        Set<String> keys2 = tm2.keySet();
		        for(String key:keys2){
		            System.out.println(key+" ==> "+tm2.get(key).getSalary());
		        }
		     
	}

}
class Empl{
    
    private String name;
    private int salary;
    private int id;
     
    public Empl(int id, String n, int s){
        this.id = id;
        this.name = n;
        this.salary = s;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
    	return id + "\n" + name + "\n" + salary + "\n"; 
     	}
}
