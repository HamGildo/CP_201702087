package 과제06;
import java.util.Scanner;
public class Account {
	private String id;
	private String password;
	private String logid;
	private String logpassword;
	
	public void 입력() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("계정을 생성합니다.");
		System.out.print("아이디를 입력하시오 : ");
		id = input.nextLine();
		System.out.print("비밀번호를 입력하시오 : ");
		password = input.nextLine();
				
	}
	
	public void login() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("로그인");
		System.out.print("ID : ");
		logid = input.nextLine();
		System.out.print("PW : ");
		logpassword = input.nextLine();
		
		if(id.equals(logid)&&password.equals(logpassword))
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
	}

}
