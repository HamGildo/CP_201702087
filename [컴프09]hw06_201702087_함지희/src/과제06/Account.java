package ����06;
import java.util.Scanner;
public class Account {
	private String id;
	private String password;
	private String logid;
	private String logpassword;
	
	public void �Է�() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �����մϴ�.");
		System.out.print("���̵� �Է��Ͻÿ� : ");
		id = input.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		password = input.nextLine();
				
	}
	
	public void login() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�α���");
		System.out.print("ID : ");
		logid = input.nextLine();
		System.out.print("PW : ");
		logpassword = input.nextLine();
		
		if(id.equals(logid)&&password.equals(logpassword))
			System.out.println("�α��� ����");
		else
			System.out.println("�α��� ����");
		
	}

}
