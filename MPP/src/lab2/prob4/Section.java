package lab2.prob4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;
	
	public Section(String courseName, int sectionNumber) {
		super();
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getSectionNumber() {
		return sectionNumber;
	}

	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}

	public List<TranscriptEntry> getGradeSheet() {
		return gradeSheet;
	}

	public void setGradeSheet(List<TranscriptEntry> gradeSheet) {
		this.gradeSheet = gradeSheet;
	}
	
	public void addGrade(TranscriptEntry grade) {
		gradeSheet.add(grade);
	}
	
	
	
}
