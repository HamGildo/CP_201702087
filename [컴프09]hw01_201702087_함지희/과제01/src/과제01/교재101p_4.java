package ����01;

import java.util.Scanner;

public class ����101p_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double r;
		double h;
		double v;
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		r = input.nextDouble();
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		h = input.nextDouble();
		
		v = r * r * 3.14 * h;
		
		System.out.println("������� ���Ǵ� " + v + "cm^3 �Դϴ�.");
		
		

	}

}
