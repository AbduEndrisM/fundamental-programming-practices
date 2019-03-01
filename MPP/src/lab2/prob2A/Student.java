package lab2.prob2A;

public class Student {
	private String name;
	GradeReport report;

	public Student(String name) {
		super();
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public GradeReport getReport() {
		return report;
	}

	public static void main(String[] args) {
		Student s = new Student("Abdu");
		System.out.println(s.getName());
		GradeReport r = new GradeReport(new Student("Mohammed"));
		System.out.println(r.getStudent().getName());

	}

}
