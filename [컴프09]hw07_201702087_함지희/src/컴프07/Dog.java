package 컴프07;

public class Dog {
	
	private String name;
	private static  String breed;
	private int age;
	
	public Dog(String name , int age) {
		this.name = name;
		this.age = age;
		breed = "말티즈";
	}
	public Dog(String name , String breed , int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public void print() {
		System.out.println("강아지의 이름 : "+ name);
		System.out.println("강아지의 종류 : "+ breed);
		System.out.println("강아지의 나이 : "+ age + "세");
	}

}
