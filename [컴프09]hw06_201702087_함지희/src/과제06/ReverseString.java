package ����06;
import java.util.Scanner;
public class ReverseString {
	private String str;

	public void �Է�() {
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		str = input.nextLine();

	}

	public void reverse() {
		for (int i = str.length() - 1; i >= 0; i--) {
			char x = str.charAt(i);
			System.out.print(x);
		}
	}

	public static void main(String[] args) {

		ReverseString a = new ReverseString();

		a.�Է�();
		a.reverse();

	}

}
