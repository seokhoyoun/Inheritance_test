package oop.inherit.sample;

public class Student extends Person implements ISub{
	// field
	private String schoolName;
	private int schoolYear;
	private double score;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String schoolName, int schoolYear, double score, String major) {
		this.schoolName = schoolName;
		this.schoolYear = schoolYear;
		this.score = score;
		this.major = major;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return this.schoolName;
	}

	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String information() {
		return this.schoolName +", "+this.schoolYear+", "+this.score+", "+this.major;
	}
}
