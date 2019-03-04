package lab2.prob4;
 
class TranscriptEntry {
	Student student;
	Section section;
	String grade;

	public  TranscriptEntry(Student student, Section section, String grade) {
		this.student = student;
		this.section =section;
		this.grade = grade;
		
		 
	}
	
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
}
