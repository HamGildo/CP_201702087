package 컴프07;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane p1 = new Plane( "보잉" , "보잉 747", 524 );
		Plane p2 = new Plane( "보잉" );
		Plane p3 = new Plane();
		
		p2.setModel("보잉 787-9");
		p2.setMaxpassenger(269);
		
		p3.setCompany("에어버스");
		p3.setModel("A380플러스");
		p3.setMaxpassenger(575);
		
		p1.print();
		p2.print();
		p3.print();
		
		System.out.println("생성된 비행기의 수 : " + Plane.getPlanes());
		
		
				
	}

}
