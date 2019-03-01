package lab2.prob4;

public class StudentSectionFactory {
	
	public Section createSection(int secNum, String courseName) {
	    Section section = new Section(courseName, secNum);	
		return section;
	}
	public Student createStudent(String name, String id) {
		Student student = new Student(name, id);
		return student;
	}
	public void newTranscriptEntry(Student student, Section section, String grade) {
		
		TranscriptEntry entry = new TranscriptEntry(student, section, grade);
		student.addGrade(entry);
		section.addGrade(entry);
		 
	}

}
