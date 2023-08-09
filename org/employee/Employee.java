package org.employee;

public class Employee {
	public void getEmployeeInfo(int Id) {
		System.out.println(Id);
	}
	public void getEmployeeInfo(int Id,String name) {
		System.out.println(Id +"  "+ name);
	}
	public void getEmployeeInfo(int Id,String name,String email) {
		System.out.println(Id +"  "+ name +"  "+ email);
	}
	public void getEmployeeInfo(int Id,String name,String email,long Mobilenumber) {
		System.out.println(Id +"  "+ name +"  "+ email+"  "+Mobilenumber);
	}
	
public static void main(String[] args) {
	Employee EmployeeInfo =  new Employee();
	EmployeeInfo.getEmployeeInfo(12345);
	EmployeeInfo.getEmployeeInfo(12345, "Dineshkumar C");
	EmployeeInfo.getEmployeeInfo(12345, "Dineshkumar C", "dinesh@gmail.com");
	EmployeeInfo.getEmployeeInfo(12345, "Dineshkumar C", "dinesh@gmail.com",1234567890L);
}

	

}
