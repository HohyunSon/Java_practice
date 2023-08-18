package Array;

/*
문제2
주어진 예제 ArrayObjSort.java에서는 Person의 인스턴스들을 나이순으로 정렬하였는데,
이를 이름의 길이 순으로 정렬이 되도록 수정해보자. 즉 이름이 길이가 짧은 인스턴스일수록 배열의 앞쪽에 위치하도록 예제를 수정해야 한다.
*/
import java.util.Arrays;

class Person2 implements Comparable<Person2> {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person2 p) {

        if(this.name.length() > p.name.length())
            return 1;
        else if(this.name.length() < p.name.length())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

class ArraysClassTest2 {
    public static void main(String[] args) {
        Person2[] ar = new Person2[3];

        ar[0] = new Person2("Leeaaa", 29);
        ar[1] = new Person2("Gooa", 15);
        ar[2] = new Person2("Soo", 37);

        Arrays.sort(ar);

        for(Person2 p : ar)
            System.out.println(p);
    }
}