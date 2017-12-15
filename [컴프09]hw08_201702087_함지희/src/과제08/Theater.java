package 과제08;
import java.util.Scanner;
public class Theater {

	public static void main(String[] args) {
		int[] seat = new int[10];
		for(int j=0; j<10; j++) {
			seat[j]=0;
		}
		
		System.out.println("좌석을 예매하시겠습니까?(예매하려면 1, 나가려면 0을 눌러주세요)");
		Scanner input = new Scanner(System.in);
		int yes = input.nextInt();
		while(yes == 1) {
			System.out.println("현재 예매 상태입니다.");
			for(int i =1 ; i<=10 ; i++) {
				System.out.print(i+" ");
				}
			System.out.println(" ");
			System.out.println("-----------------------");
			for(int z=0; z<10; z++) {
				System.out.print(seat[z]+" ");
			}
		System.out.println(" ");
		System.out.println("몇번째 좌석을 예매하시겠습니까?");
		int num = input.nextInt();
		seat[num-1] = 1;
		System.out.println("예매를 계속 하시겠습니까?(계속하려면 1, 나가려면 0을 눌러주세요)");
		int yess = input.nextInt();
		if(yess == 1) {
			System.out.println(" ");}
		else if(yess == 0)
			break;
		}
		System.out.println("감사합니다.");

	}

}
