package ����08;
import java.util.Scanner;
public class Theater {

	public static void main(String[] args) {
		int[] seat = new int[10];
		for(int j=0; j<10; j++) {
			seat[j]=0;
		}
		
		System.out.println("�¼��� �����Ͻðڽ��ϱ�?(�����Ϸ��� 1, �������� 0�� �����ּ���)");
		Scanner input = new Scanner(System.in);
		int yes = input.nextInt();
		while(yes == 1) {
			System.out.println("���� ���� �����Դϴ�.");
			for(int i =1 ; i<=10 ; i++) {
				System.out.print(i+" ");
				}
			System.out.println(" ");
			System.out.println("-----------------------");
			for(int z=0; z<10; z++) {
				System.out.print(seat[z]+" ");
			}
		System.out.println(" ");
		System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
		int num = input.nextInt();
		seat[num-1] = 1;
		System.out.println("���Ÿ� ��� �Ͻðڽ��ϱ�?(����Ϸ��� 1, �������� 0�� �����ּ���)");
		int yess = input.nextInt();
		if(yess == 1) {
			System.out.println(" ");}
		else if(yess == 0)
			break;
		}
		System.out.println("�����մϴ�.");

	}

}
