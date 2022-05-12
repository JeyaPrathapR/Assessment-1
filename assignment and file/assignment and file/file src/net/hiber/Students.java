package net.hiber;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class Students implements Serializable{
	
	@Id
	@GeneratedValue
	
	
	@Column(name="student_name")
private String studentName;
	
	@Column(name="roll_no")
	private int rollNo;

	@Column(name="address")
	private String addressDetail;
	
	@Column(name="dob")
	private String dateOfBirth;

	@Column(name="department")
	private String dept;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Students [studentName=" + studentName + ", rollNo=" + rollNo + ", addressDetail=" + addressDetail
				+ ", dateOfBirth=" + dateOfBirth + ", dept=" + dept + "]";
	}
	



	
}
