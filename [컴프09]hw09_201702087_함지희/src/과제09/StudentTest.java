package 과제09;

public class StudentTest {

	public static void main(String[] args) {
		
		Undergraduate a = new Undergraduate("함씨","201702087","컴퓨터공학과","1학년","15","ANT");
		Graduate b = new Graduate("이씨","200802066","컴퓨터공학과","1학년","17",true,0.6f);
		
		a.print();
		b.print();

	}

}
