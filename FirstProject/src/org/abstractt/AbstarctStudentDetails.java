package org.abstractt;

public class AbstarctStudentDetails extends AbstractStudent{

	public void student() {
		System.out.println("Enter Student Details");
	}

	@Override
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name:Vikneshwaraa");
		
	}

	@Override
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Dept:BE");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstarctStudentDetails stu=new AbstarctStudentDetails();
		stu.student();
		stu.studentId();
		stu.studentName(); //override
		stu.studentDept();  //override
		

	}

}
