package 과제03;

import java.util.Scanner;

public class P133_2 {

	public static void main(String[] args) {
		
		double x,y,z,a;
		Scanner input = new Scanner(System.in);
		
		System.out.print("키를 입력하시오 : ");
		x = input.nextDouble();
		
		System.out.print("몸무게를 입력하시오 : ");
		y = input.nextDouble();
		
		z = (x - 100) * 0.9;
		a = (y - z) / z * 100;
		
		if(a > 10) {
			System.out.println("과체중입니다.");
		}
		else if(a < -10) {
			System.out.println("저체중입니다.");
		}
		else {
			System.out.println("표준체중입니다.");
		}
		
		
	}

}
