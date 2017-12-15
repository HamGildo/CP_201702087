package 과제01;

import java.util.Scanner;

public class 교재73p_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double C;
		double F;
		
		System.out.print("화씨 온도를 입력하시오 : ");
		F = input.nextDouble();
		
		C = 5 * (F - 32) / 9;
		
		System.out.println("섭씨 온도는 " + C + "도 입니다.");
			
		
		
	}

}
