package model;

import java.util.Date;

public class Student {

	private int StudentNo;
	private String StudentName;
	private Date DateOfBirth;
	private Date DateOfJoin;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int StudentNo, String StudentName, Date DateOfBirth,Date DateOfJoin)
			 {
		super();
		this.StudentNo = StudentNo;
		this.StudentName = StudentName;
		this.DateOfBirth=DateOfBirth;
		this.DateOfJoin = DateOfJoin;
		
	}
	public int getStudentNo() {
		return StudentNo;
	}
	public void setStudentNo(int StudentNo) {
		this.StudentNo=StudentNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String StudentName) {
		this.StudentName =StudentName;
	}
	
	public  Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateofBirth(Date DateOfBirth) {
		this.DateOfBirth=DateOfBirth;
	}
	
	public  Date getDateOfJoin() {
		return DateOfJoin;
	}

	public void setDateOfJoin(Date DateOfJoin) {
		this.DateOfJoin=DateOfJoin;
	}
	
	
}
