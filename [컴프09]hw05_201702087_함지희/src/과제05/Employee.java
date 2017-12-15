package 과제05;

public class Employee {
	
	private String name ;
	private String phoneNumber ;
	private long annualSalary ;
	
	public String getName() { return name ;}
	public void setName(String n) { name = n ;}
	public String getPhoneNumber() { return phoneNumber ;}
	public void setPhoneNumber(String p) { phoneNumber = p ;}
	public long getAnnualSalary() { return annualSalary ;}
	public void setAnnualSalary(long a) { annualSalary = a ;}
	
	public void print() {
		System.out.println("직원의 이름 : " + getName());
		System.out.println("직원의 번호 : " + getPhoneNumber());
		System.out.println("직원의 연봉 : " + getAnnualSalary() + "원");
	}
	
	
}
