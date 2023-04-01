package org.iinterface;

public class Interface implements Interfacestudent {
  public void student() {
	  System.out.println("Enter Student Details");
  }
	
	@Override
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Studentid is:10011");
	}

	@Override
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name:Ragavi");
		
	}

	@Override
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Department:BE cse");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Interface i=new Interface();
     i.student();
     i.studentId(); //override
     i.studentName();
     i.studentDept();
	}


}
