package standardexams.classwork2;

public class Admin {
	//implement
	Department[] deps = new Department[3];
	
	public Admin(Department[] deps) {
		this.deps=deps;
		
	}
	
	public String hourlyCompanyMessage() {
		String mesg ="";

		for(Department d: deps) {
			
			mesg=mesg+format(d.getName(), d.nextMessage()) + "\n";
		}
		return mesg;
		
		
	}
	
	public String format (String name, String msg) {
		 
		return  name + ":  "+msg;
	}
	
}
