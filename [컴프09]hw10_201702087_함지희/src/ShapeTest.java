import java.util.Scanner;
public class ShapeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("삼각형의 밑변 : ");
		int tw = input.nextInt();
		System.out.print("삼각형의 높이 : ");
		int th = input.nextInt();
		Triangle t = new Triangle(tw , th);
		
		System.out.print("사각형의 밑변 : ");
		int rw = input.nextInt();
		System.out.print("사각형의 높이 : ");
		int rh = input.nextInt();
		Rectangle r = new Rectangle(rw , rh);
		
		System.out.print("원의 반지름 : ");
		int cr = input.nextInt();
		Circle c = new Circle(cr , cr);
		
		Shape[] shape = new Shape[3];
		shape[0] = t;
		shape[1] = r;
		shape[2] = c;
		
		for(int i = 0; i < shape.length; i++)
			switch(i) {
			 case 0:
			    System.out.println("삼각형의 넓이는 "+shape[i].area());
			    break;
			 case 1:
				System.out.println("사각형의 넓이는 "+shape[i].area());
				break;
			 case 2:
				System.out.println("원의 넓이는 약 "+shape[i].area());
				break;
				
			};
		

	}

}
