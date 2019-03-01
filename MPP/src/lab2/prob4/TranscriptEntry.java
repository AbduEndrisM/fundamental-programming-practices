package lab2.prob4;
 
class TranscriptEntry {
	Student student;
	Section section;
	String grade;

	public  TranscriptEntry(Student s, Section sect, String grade) {
		student = s;
		section =sect;
		this.grade = grade;
		
		 
	}
	
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
}
