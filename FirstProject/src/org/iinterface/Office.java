package org.iinterface;

public class Office implements OfficeInterface,OfficeInterface1 {
	//multiple inheritance
//method override for fully abstract
	
	
	@Override
	public void staffsCount() {
		// TODO Auto-generated method stub
		System.out.println("Total no of StaffCount:" +count);	
	}
	@Override
	public void officeArea() {
		// TODO Auto-generated method stub
		System.out.println("Our Office Area:" +area);
	}
	
//method overload
	private void PKPCompany(String name) {
		System.out.println("Staff Name:" +name);
	}
	private void PKPCompany(int id) {
		System.out.println("Staff ID:"+id);
	}
	private void PKPCompany(String dept,int deptcode) {
		System.out.println("Dept:"+dept );
		System.out.println("DeptCode:"+deptcode);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Office off=new Office();
    off.staffsCount();
    off.officeArea();
    off.PKPCompany(1002);
    off.PKPCompany("Muthu");
    off.PKPCompany("Computer", 45001);
   
    
	}
	@Override
	public void staffName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void staffId() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void staffDept() {
		// TODO Auto-generated method stub
		
	}

}
