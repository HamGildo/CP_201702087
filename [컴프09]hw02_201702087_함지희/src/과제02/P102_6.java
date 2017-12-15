package 과제02;

import java.util.Scanner;

public class P102_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int 오백원;
		int 백원;
		int 오십원;
		int 십원;
		int 총액;

		System.out.println("동전의 개수를 입력하시오");
		System.out.print("500원 : ");
		오백원 = input.nextInt();
		System.out.print("100원 : ");
		백원 = input.nextInt();
		System.out.print("50원 : ");
		오십원 = input.nextInt();
		System.out.print("10원 : ");
		십원 = input.nextInt();
		
		총액 = 오백원 * 500 + 백원 * 100 + 오십원 * 50 + 십원 * 10;
		
		System.out.println("저금통의 총 액수는 " + 총액 + "원 입니다.");
		
	}

}
