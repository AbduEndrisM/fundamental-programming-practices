package lesson3.classDemo;

public class Contact {
	String email;
	String Mobile;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	
	Contact(String email, String Mobile){
		this.email = email;
		this.Mobile = Mobile;
	}
}


