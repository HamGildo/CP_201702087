package ����02;

import java.util.Scanner;

public class P102_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int �����;
		int ���;
		int ���ʿ�;
		int �ʿ�;
		int �Ѿ�;

		System.out.println("������ ������ �Է��Ͻÿ�");
		System.out.print("500�� : ");
		����� = input.nextInt();
		System.out.print("100�� : ");
		��� = input.nextInt();
		System.out.print("50�� : ");
		���ʿ� = input.nextInt();
		System.out.print("10�� : ");
		�ʿ� = input.nextInt();
		
		�Ѿ� = ����� * 500 + ��� * 100 + ���ʿ� * 50 + �ʿ� * 10;
		
		System.out.println("�������� �� �׼��� " + �Ѿ� + "�� �Դϴ�.");
		
	}

}
