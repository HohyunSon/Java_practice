package cloneEx1;

public class PersonMain{
	public static void main(String[] args) {
		Person person = new Person("홍길동",20);
		try {
			Person cpy = person.clone();
			person.show();
			cpy.show();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}