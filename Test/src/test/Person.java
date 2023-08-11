package test;

public class Person implements Cloneable{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(age);
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Person)super.clone();
	}
	
	
}