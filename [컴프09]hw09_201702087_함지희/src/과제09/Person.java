package 과제09;

public class Person {

	public String name;
	public String add;
	public String phoneNum;
	
	public Person(String name , String add , String phoneNum) {
		this.name = name;
		this.add = add;
		this.phoneNum = phoneNum;
	}
	public Person() {}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setAdd(String add) {this.add = add;}
	public String getAdd() {return add;}
	public void setPhoneNum(String phoneNum) {this.phoneNum = phoneNum;}
	public String getPhoneNum() {return phoneNum;}
}
	
class Customer extends Person{
		
	public String customerNum;
	public long mile;
	
	public Customer(String name , String add , String phoneNum,String customerNum , long mile) {
		super(name,add,phoneNum);
		this.customerNum = customerNum;
		this.mile = mile;
		}
	public Customer() {}
	public void setCustomerNum(String customerNum) {this.customerNum = customerNum;}
	public String getCustomerNum() {return customerNum;}
	public void setMile(long mile) {this.mile = mile;}
	public long getMile() {return mile;}
	
	public void print() {
	System.out.println("고객 이름 : "+getName());
	System.out.println("주소 : "+getAdd());
	System.out.println("번호 : "+getPhoneNum());
	System.out.println("고객 번호 : "+getCustomerNum());
	System.out.println("마일리지 : "+getMile());
	}
}
    
	
	

