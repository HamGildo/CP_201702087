package ����03;

import java.util.Scanner;

public class P133_2 {

	public static void main(String[] args) {
		
		double x,y,z,a;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		x = input.nextDouble();
		
		System.out.print("�����Ը� �Է��Ͻÿ� : ");
		y = input.nextDouble();
		
		z = (x - 100) * 0.9;
		a = (y - z) / z * 100;
		
		if(a > 10) {
			System.out.println("��ü���Դϴ�.");
		}
		else if(a < -10) {
			System.out.println("��ü���Դϴ�.");
		}
		else {
			System.out.println("ǥ��ü���Դϴ�.");
		}
		
		
	}

}
