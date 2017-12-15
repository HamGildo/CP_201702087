package 과제03;

import java.util.Scanner;

public class P133_1 {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		x = input.nextInt();
		
		System.out.print("정수를 입력하시오 : ");
		y = input.nextInt();
		
		System.out.print("정수를 입력하시오 : ");
		z = input.nextInt();
		
		if(x >= y) {
			if(y >= z){
				System.out.println("정렬된 숫자 : " + x +" "+ y +" "+ z );
							}
			else if(z >= x) {
				System.out.println("정렬된 숫자 : " + z +" "+ x +" "+ y );
			}
			else {
				System.out.println("정렬된 숫자 : " + x +" "+ z +" "+ y );
			}
		}
		else {
			if(x >= z){
				System.out.println("정렬된 숫자 : " + y +" "+ x +" "+ z );
			}
			else if(z >= y) {
				System.out.println("정렬된 숫자 : " + z +" "+ y +" "+ x );
			}
			else {
				System.out.println("정렬된 숫자 : " + y +" "+ z +" "+ x );
			}
		}
		
		

	}

}
