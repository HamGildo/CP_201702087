package ����07;

public class Plane {
	
	private String company;
	private String model;
	private int maxpassenger;
	private static int planes = 0;
	
	public void setCompany(String c) { company = c; }
	public String getCompany() { return company; }
	public void setModel(String m) { model = m; }
	public String getModel() { return model; }
	public void setMaxpassenger(int mp) { maxpassenger = mp; }
	public int getMaxpassenger() { return maxpassenger; }
	
	public Plane(String c , String m , int mp) {
		company = c;
		model = m;
		maxpassenger = mp;
		++planes;
	}
	public Plane(String c) {
		company = c;
		++planes;
	}
	public Plane() {
		++planes;
	}
	public static int getPlanes() { return planes; }
	public void print() {
		System.out.println("����� ������ : "+ this.getCompany() );
		System.out.println("����� �� : " + this.getModel() );
		System.out.println("����� �ִ�°��� : " + this.getMaxpassenger() + "��" );
		
	}
	
	
	

}
