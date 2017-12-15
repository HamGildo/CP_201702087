package 과제01;

import java.util.Scanner;

public class 교재101p_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double r;
		double h;
		double v;
		
		System.out.print("반지름을 입력하시오 : ");
		r = input.nextDouble();
		
		System.out.print("높이를 입력하시오 : ");
		h = input.nextDouble();
		
		v = r * r * 3.14 * h;
		
		System.out.println("원기둥의 부피는 " + v + "cm^3 입니다.");
		
		

	}

}
