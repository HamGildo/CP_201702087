package ����07;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane p1 = new Plane( "����" , "���� 747", 524 );
		Plane p2 = new Plane( "����" );
		Plane p3 = new Plane();
		
		p2.setModel("���� 787-9");
		p2.setMaxpassenger(269);
		
		p3.setCompany("�������");
		p3.setModel("A380�÷���");
		p3.setMaxpassenger(575);
		
		p1.print();
		p2.print();
		p3.print();
		
		System.out.println("������ ������� �� : " + Plane.getPlanes());
		
		
				
	}

}
