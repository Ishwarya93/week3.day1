package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName");
	}
	public void studentDept() {
		System.out.println("studentDept");
	}
	public void studentId() {
		System.out.println("studentId");


}
	
	public static void main(String[] args) {
		College CO = new College();
		Department DO = new Department();
		Student SO = new Student();
		CO.collegeCode();
		CO.collegeName();
		CO.collegeRank();
		System.out.println("-------");
		DO.deptName();
		DO.collegeCode();
		DO.collegeName();
		DO.collegeRank();
		System.out.println("-------");
		SO.studentDept();
		SO.studentId();
		SO.studentName();
		SO.collegeCode();
		SO.collegeName();
		SO.collegeRank();
		SO.deptName();
		
	}
}

