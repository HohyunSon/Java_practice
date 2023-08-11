package test;

public class PersonMain{
	public static void main(String[] args) {
		Person person = new Person("jhi",11);
		try {
			Person cpy = person.clone();
			person.show();
			cpy.show();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}