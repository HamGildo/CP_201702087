package ����03;

import java.util.Scanner;

public class P133_1 {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		x = input.nextInt();
		
		System.out.print("������ �Է��Ͻÿ� : ");
		y = input.nextInt();
		
		System.out.print("������ �Է��Ͻÿ� : ");
		z = input.nextInt();
		
		if(x >= y) {
			if(y >= z){
				System.out.println("���ĵ� ���� : " + x +" "+ y +" "+ z );
							}
			else if(z >= x) {
				System.out.println("���ĵ� ���� : " + z +" "+ x +" "+ y );
			}
			else {
				System.out.println("���ĵ� ���� : " + x +" "+ z +" "+ y );
			}
		}
		else {
			if(x >= z){
				System.out.println("���ĵ� ���� : " + y +" "+ x +" "+ z );
			}
			else if(z >= y) {
				System.out.println("���ĵ� ���� : " + z +" "+ y +" "+ x );
			}
			else {
				System.out.println("���ĵ� ���� : " + y +" "+ z +" "+ x );
			}
		}
		
		

	}

}
