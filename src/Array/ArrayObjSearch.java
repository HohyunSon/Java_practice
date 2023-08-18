package Array;

import java.util.Arrays;

class Person3 implements Comparable<Person3> {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person3 p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}


class ArrayObjSearch {
    public static void main(String[] args) {
        Person3[] ar = new Person3[3];

        ar[0] = new Person3("Lee", 29);
        ar[1] = new Person3("Goo", 15);
        ar[2] = new Person3("Soo", 37);

        Arrays.sort(ar);

        int idx = Arrays.binarySearch(ar, new Person3("Who are you?", 37));
        System.out.println(ar[idx]);
    }
}
