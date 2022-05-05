package org.student;

public class Students {
	public void getStudentInfo(int ID) {
		System.out.println("ID-"+ ID);
	}
	public void getStudentInfo(int ID,String name) {
		System.out.println("ID-"+ ID +"- Student name - "+name);
	}
	public void getStudentInfo(int ID,String name,String Emailid) {
		System.out.println("ID-"+ ID +"- Student name - "+name+"- Student Email - "+Emailid);
	}
	public void getStudentInfo(int ID,String name,String Emailid,long phonenumer) {
		System.out.println("ID-"+ ID +"- Student name - "+name+"- Student Email - "+Emailid+"- Student Email - "+phonenumer);
	}	

	public static void main(String[] args) {
		Students Stinfo = new Students();
		Stinfo.getStudentInfo(1234);
		Stinfo.getStudentInfo(1234, "Ishwarya");
		Stinfo.getStudentInfo(1234, "Ishwarya", "ishwarya93bca@gmail.com");
		Stinfo.getStudentInfo(1234, "Ishwarya", "ishwarya93bca@gmail.com",786538);
	}
}
