package lab2.prob4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	Student bob;
	Student tim;
	Student allen;
	Section bio1;
	Section bio2;
	Section math;
	Student[] students = {bob, tim, allen};

	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		System.out.println(m.getTranscript(m.bob));
		System.out.println("Grades for math section:\n " + m.getGrades(m.math));
		System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
//		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
	}
	
	private Transcript getTranscript(Student s) {
 
		return s.getTranscript();
	}
	private List<String> getCourseNames(Student s) {
		List<TranscriptEntry> all = s.grades;
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.section.courseName);
		}
		return courseNames;
	}
	private List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.gradeSheet) {
			grades.add(t.grade);
		}
		return grades;
	}
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		
		for(Student s : students) {
			
			boolean found = false;
			for(TranscriptEntry te : s.grades) {
				if(!found) {
					if(te.grade.equals(grade)) {
						found = true;
 						studentNames.add(s.name);
					}
				}
			}
		}
		return studentNames;
	}
	private void readDataFromDb() {
			StudentSectionFactory factory = new StudentSectionFactory();
		bob = factory.createStudent(null, "Bob");
		tim = factory.createStudent(null, "Tim");
		allen = factory.createStudent(null, "Allen");
		bio1 = factory.createSection(1, "Biology");
		bio2 = factory.createSection(2, "Biology");
		math = factory.createSection(3, "Mathematics");
		
	 
		
		
		TranscriptEntry[] entries ={new TranscriptEntry(bob, bio1, "A"), new TranscriptEntry(bob, math, "B"), 
									new TranscriptEntry(tim, bio1, "B+"), new TranscriptEntry(tim, math, "A-"),
									new TranscriptEntry(allen, math, "B"), new TranscriptEntry(allen, bio2, "B+")
									};
		
		/*	{factory.newTranscriptEntry(bob, bio1, "A"), factory.newTranscriptEntry(bob, bio1, "A"), 
					factory.newTranscriptEntry(bob, bio1, "A"), factory.newTranscriptEntry(bob, bio1, "A"), 
					factory.newTranscriptEntry(bob, bio1, "A"), factory.newTranscriptEntry(bob, bio1, "A")};
*/

		
//		entries[1].student = bob;
//		entries[1].section = math;
//		entries[1].grade = "B";
//		
//		entries[2].student = tim;
//		entries[2].section = bio1;
//		entries[2].grade = "B+";
//		
//		entries[3].student = tim;
//		entries[3].section = math;
//		entries[3].grade = "A-";
//		
//		entries[4].student = allen;
//		entries[4].section = math;
//		entries[4].grade = "B";
//		
//		entries[5].student = allen;
//		entries[5].section = bio2;
//		entries[5].grade = "B+";

		//insert entries into sections
		List<TranscriptEntry> gradesForBio1 = new ArrayList<>();
		gradesForBio1.add(entries[0]);
		gradesForBio1.add(entries[2]);
		bio1.gradeSheet = gradesForBio1;
		
		List<TranscriptEntry> gradesForBio2 = new ArrayList<>();
		gradesForBio2.add(entries[5]);
		bio2.gradeSheet = gradesForBio2;
		
		List<TranscriptEntry> gradesForMath = new ArrayList<>();
		gradesForMath.add(entries[1]);
		gradesForMath.add(entries[3]);
		gradesForMath.add(entries[4]);
		math.gradeSheet = gradesForMath;
		
		//insert entries into students
		List<TranscriptEntry> gradesForBob = new ArrayList<>();
		gradesForBob.add(entries[0]);
		gradesForBob.add(entries[1]);
		bob.grades = gradesForBob;
		
		List<TranscriptEntry> gradesForTim = new ArrayList<>();
		gradesForTim.add(entries[2]);
		gradesForTim.add(entries[3]);
		tim.grades = gradesForTim;
		
		List<TranscriptEntry> gradesForAllen = new ArrayList<>();
		gradesForAllen.add(entries[4]);
		gradesForAllen.add(entries[5]);
		allen.grades = gradesForAllen;
		
	}

}
