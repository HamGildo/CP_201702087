package 과제01;

import java.util.Scanner;

public class 교재73p_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		double x;
		double k;
			
		System.out.print("마일을 입력하시오 : ");
		x = input.nextDouble();
		
		k = x * 1.609;						
		
		System.out.println(x + "마일은 " + k + "킬로미터입니다.");
		

	}

}
