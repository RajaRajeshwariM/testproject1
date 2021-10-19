package com.raji.curd.model;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
@Data
@Document("student")
public class Student {
		@Id
		String id;
		
		private String studentName;
		private String collegeName;
		private String deptName;
		private Integer Academicyear;
		private String fatherName;
		private String address;
		private Integer percentage;
		/*
		 * @Override public String toString() { return "Student [id=" + id +
		 * ", studentName=" + studentName + ", collegeName=" + collegeName +
		 * ", deptName=" + deptName + ", Academicyear=" + Academicyear + ", fatherName="
		 * + fatherName + ", address=" + address + ", percentage=" + percentage + "]"; }
		 * public Student() { super(); // TODO Auto-generated constructor stub } public
		 * Student(String id, String studentName, String collegeName, String deptName,
		 * Integer academicyear, String fatherName, String address, Integer percentage)
		 * { super(); this.id = id; this.studentName = studentName; this.collegeName =
		 * collegeName; this.deptName = deptName; Academicyear = academicyear;
		 * this.fatherName = fatherName; this.address = address; this.percentage =
		 * percentage; }
		 * 
		 * public String getId() { return id; } public void setId(String id) { this.id =
		 * id; } public String getStudentName() { return studentName; } public void
		 * setStudentName(String studentName) { this.studentName = studentName; } public
		 * String getCollegeName() { return collegeName; } public void
		 * setCollegeName(String collegeName) { this.collegeName = collegeName; } public
		 * String getDeptName() { return deptName; } public void setDeptName(String
		 * deptName) { this.deptName = deptName; } public Integer getAcademicyear() {
		 * return Academicyear; } public void setAcademicyear(Integer academicyear) {
		 * Academicyear = academicyear; } public String getFatherName() { return
		 * fatherName; } public void setFatherName(String fatherName) { this.fatherName
		 * = fatherName; } public String getAddress() { return address; } public void
		 * setAddress(String address) { this.address = address; } public Integer
		 * getPercentage() { return percentage; } public void setPercentage(Integer
		 * percentage) { this.percentage = percentage; }
		 */
		public void setMessage(String string) {
			// TODO Auto-generated method stub
			
		}
	}
		
		
		