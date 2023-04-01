package org.overload;

public class Overloading {
	 private void Employee() {
		System.out.println("Employee Details");
		System.out.println("*****************");
	}
	public void Employee(String name) {
		System.out.println("Employee Name:"+name );
	}
	//differs based on arguments datatype 
	private void Employee(int empid) {
		System.out.println("Employee Id:" +empid);
	}
	private void Employee(long phoneno) {
		System.out.println("Employee Phoneno:"+phoneno);
	}
	//differs based on arguments datatype count
	private void Employee(String designation,int empid) {
		System.out.println("Employee Designation:"+designation);
	}
	private void Employee(float attper) {
		System.out.println("Employee Attendance Percentage:"+attper);
	}
	private void Employee(double salary,float pf,float esi) {
		System.out.println("Employee Salary:"+salary+  "Employee PF:"+pf+"Employee ESI:"+esi);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol=new Overloading();
		ol.Employee();
		ol.Employee("Ragavi");
		ol.Employee(0001);
		ol.Employee(9842328349l);
		ol.Employee("QA Analyst",234400);
		ol.Employee(90);
		ol.Employee(20000d, 3000f, 500f);
		
		
		
		
		
		

	}

}
