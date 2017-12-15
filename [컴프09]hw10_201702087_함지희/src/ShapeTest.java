import java.util.Scanner;
public class ShapeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ﰢ���� �غ� : ");
		int tw = input.nextInt();
		System.out.print("�ﰢ���� ���� : ");
		int th = input.nextInt();
		Triangle t = new Triangle(tw , th);
		
		System.out.print("�簢���� �غ� : ");
		int rw = input.nextInt();
		System.out.print("�簢���� ���� : ");
		int rh = input.nextInt();
		Rectangle r = new Rectangle(rw , rh);
		
		System.out.print("���� ������ : ");
		int cr = input.nextInt();
		Circle c = new Circle(cr , cr);
		
		Shape[] shape = new Shape[3];
		shape[0] = t;
		shape[1] = r;
		shape[2] = c;
		
		for(int i = 0; i < shape.length; i++)
			switch(i) {
			 case 0:
			    System.out.println("�ﰢ���� ���̴� "+shape[i].area());
			    break;
			 case 1:
				System.out.println("�簢���� ���̴� "+shape[i].area());
				break;
			 case 2:
				System.out.println("���� ���̴� �� "+shape[i].area());
				break;
				
			};
		

	}

}
