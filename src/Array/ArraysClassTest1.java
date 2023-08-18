package Array;

/*
문제 1
주어진 예제 ArrayObjSort.java에서는 Person의 인스턴스들을 나이순으로 정렬하였는데,
이를 수정하여 나이의 역순으로 정렬이 되도록 해보자. 다시 말해서, 많은 나이의 인스턴스일수록 배열의 앞쪽에 위치하도록 예제를 수정해보자.
*/
import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if(this.age < p.age)
            return 1;
        else if(this.age > p.age)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

class ArraysClassTest1 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);

        for(Person p : ar)
            System.out.println(p);
    }
}
