package 과제09;

public class Student {
	
	public String name;
	public String num;
	public String major;
	public String grade;
	public String credit;
	
	public Student(String name,String num,String major,String grade,String credit) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	public Student() {}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setNum(String num) {this.num = num;}
	public String getNum() {return num;}
	public void setMajor(String major) {this.major = major;}
	public String getMajor() {return major;}
	public void setGrade(String grade) {this.grade = grade;}
	public String getGrade() {return grade;}
	public void setCredit(String credit) {this.credit = credit;}
	public String getCredit() {return credit;}
	
}

class Undergraduate extends Student{
	
	public String club;
	
	public Undergraduate(String name,String num,String major,String grade,String credit,String club) {
		super(name,num,major,grade,credit);
		this.club = club;
		}
	public Undergraduate() {}
	public void setClub(String club) {this.club = club;}
	public String getClub() {return club;}
	
	public void print() {
		System.out.println("이름 : "+getName());
		System.out.println("학번 : "+getNum());
		System.out.println("학과 : "+getMajor());
		System.out.println("학년 : "+getGrade());
		System.out.println("이수학점 : "+getCredit());
		System.out.println("동아리 : "+getClub());
		System.out.println(" ");
		
	}
}

class Graduate extends Student{
	
	public boolean assistant;
	public float scholarship;
	
	public Graduate(String name,String num,String major,String grade,String credit,boolean assistant,float scholarship) {
		super(name,num,major,grade,credit);
		this.assistant = assistant;
		this.scholarship = scholarship;
	}
	
	public Graduate() {}
	public void setAssistant(boolean assistant) {this.assistant = assistant;}
	public String getAssistant() {
		if(assistant == true)
			return "교육 조교";
		else
			return "연구 조교";	
		}
	public void setScholarship(float scholarship) {this.scholarship = scholarship;}
	public float getScholarship() {return scholarship;}
	
	public void print() {
		System.out.println("이름 : "+getName());
		System.out.println("학번 : "+getNum());
		System.out.println("학과 : "+getMajor());
		System.out.println("학년 : "+getGrade());
		System.out.println("이수학점 : "+getCredit());
		System.out.println("조교 유형 : "+getAssistant());
		System.out.println("장학금 비율 : "+getScholarship()+"%");
		System.out.println(" ");
	}
}
