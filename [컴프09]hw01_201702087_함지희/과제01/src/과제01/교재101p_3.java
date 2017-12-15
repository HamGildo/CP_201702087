package 과제01;

import java.util.Scanner;

public class 교재101p_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double h;
		double f;
		double i;
		
		System.out.print("키를 입력하시오 : ");
		h = input.nextDouble();
		
		i = h / 2.54;
		f = i / 12;
		
		System.out.println(h + "cm는" + f + "피트 " + i + "인치입니다." );
		
		
		
		
		
		
		
	}

}
