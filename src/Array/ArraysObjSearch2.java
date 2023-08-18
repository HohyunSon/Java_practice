package Array;

//탐색의 기준 변경
//앞서 예제 ArrayObjSearch.java에서 탐색의 기준은 나이였다. 그런데 이 탐색의 기준이 이름이 되도록 예제를 수정해보자.

import java.util.Arrays;

class Person4 implements Comparable<Person4> {
    private String name;
    private int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person4 p) {
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}


class ArrayObjSearch2 {
    public static void main(String[] args) {
        Person4[] ar = new Person4[3];

        ar[0] = new Person4("aaa", 29);
        ar[1] = new Person4("bb", 15);
        ar[2] = new Person4("c", 37);

        Arrays.sort(ar);
        int idx = Arrays.binarySearch(ar, new Person4("c", 0));
        System.out.println(ar[idx]);
    }
}