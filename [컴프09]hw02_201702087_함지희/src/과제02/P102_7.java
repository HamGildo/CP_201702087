package 과제02;
import java.util.Scanner;
public class P102_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    float x;
		double y;
		
		System.out.print("평을 입력하시오 : ");		
		x = input.nextFloat(); 
		
		y = x * 3.3058;
		
		System.out.println(x + "평은" + y + "평방미터 입니다.");

	}

}
