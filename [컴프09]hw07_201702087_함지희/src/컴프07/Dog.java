package ����07;

public class Dog {
	
	private String name;
	private static  String breed;
	private int age;
	
	public Dog(String name , int age) {
		this.name = name;
		this.age = age;
		breed = "��Ƽ��";
	}
	public Dog(String name , String breed , int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public void print() {
		System.out.println("�������� �̸� : "+ name);
		System.out.println("�������� ���� : "+ breed);
		System.out.println("�������� ���� : "+ age + "��");
	}

}
