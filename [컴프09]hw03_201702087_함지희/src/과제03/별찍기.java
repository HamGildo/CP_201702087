package 과제03;

public class 별찍기 {
	public static void main(String[] args) {

		for (int i = 5, k = 4; i <= 9; i++, k--) {
			for (int j = 1; j <= i; j++) {

				if (j > k) {
					System.out.print("*");
				} 
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 8, k = 1; i >= 5; i--, k++) {
			for (int j = 1; j <= i; j++) {
				if (j > k) {
					System.out.print("*");
				} 
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	}

}
