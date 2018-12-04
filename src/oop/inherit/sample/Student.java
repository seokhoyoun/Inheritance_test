package oop.inherit.sample;

public class Student extends Person implements ISub, java.io.Serializable	{
	// field
	private String schoolName;
	private int schoolYear;
	private double score;
	private String major;
	
	public Student() {
		super(); // 부모의 기본생성자 호출구문
		System.out.println("Student() runs...");
	}
	
	public Student(String schoolName, int schoolYear, double score, String major) {
		super();
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
	
	public Student(String name, int age, char gender, String schoolName, int schoolYear, double score, String major) {
		super(name, age, gender);
		// 부모의 매개변수 있는 생성자 호출 가능
		// this.name = name * 부모의 private 멤버는 상속은 받지만 접근은 할 수 없다.
		this.schoolName = schoolName;
		this.schoolYear = schoolYear;
		this.score = score;
		this.major = major;
	}
	// 어노테이션을 표시해야함 (annotation) : 컴파일러 주석문.
	@Override //오버라이드 할 경우 꼭 작성한다.- 부모의 메소드를 후손이 다시 작성하는 것.
	public String information() {
		return super.information()+
				this.schoolName +", "+this.schoolYear+"학년, "+this.score+"점, "+this.major;
	}
}
