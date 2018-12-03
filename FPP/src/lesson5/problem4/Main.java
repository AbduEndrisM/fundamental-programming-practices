package lesson5.problem4;

public class Main {

	public static void main(String[] args) {

		Employee [] emp = {
				new CommisionEmployee("Abdu", "Abdu", "123456789",700.0,10),
				new HourlyEmployee("Abdu", "Abdu", "123456789",1000.0,5),
				new SalariedEmployee("Abdu", "Abdu", "123456789",400),
				new BasePlusComissionEmployee("Abdu", "Abdu", "123456789",8000.0,7,6000)
		};
		
		for (Employee e:emp) {
			System.out.println(e.getClass().getSimpleName()+" : "+e.getPayment());
		}
	}

}
