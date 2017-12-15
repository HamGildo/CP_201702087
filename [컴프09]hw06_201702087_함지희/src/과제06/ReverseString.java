package 과제06;
import java.util.Scanner;
public class ReverseString {
	private String str;

	public void 입력() {
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
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

		a.입력();
		a.reverse();

	}

}
