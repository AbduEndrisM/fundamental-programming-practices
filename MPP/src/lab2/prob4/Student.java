package lab2.prob4;

import java.util.*;

import javax.swing.text.html.parser.Entity;

public class Student {
	  String name;
	  String id;
	List<TranscriptEntry> grades;
	
	
	
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void addGrade(TranscriptEntry grade) {
		grades.add(grade);
	}
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}

	 
		 
}
