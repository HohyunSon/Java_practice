/*
Person클래스는 기본적으로 나이를 기준으로 정렬하게끔 되어 있다.
이를 이름을 기준으로 정렬하게끔 바꿔보자.
주어진 소스코드에서 Person의 코드가 바뀌면 안된다.
 */
package CollectionFramework;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


class Person2 implements Comparable<Person2>
{
    String name;
    int age;

    public Person2(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void showData()
    {
        System.out.printf("%s %d \n", name, age);
    }
    public int compareTo(Person2 p)
    {
        return age - p.age;
    }
    public String getName() {
        return name;
    }

}

class IntroComparator
{
    public static void main(String[] args)
    {
        TreeSet<Person2> sTree=new TreeSet<>(new Comparator<>() {
            public int compare(Person2 p1, Person2 p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        sTree.add(new Person2("Lee", 24));
        sTree.add(new Person2("Hong", 29));
        sTree.add(new Person2("Choi", 21));

        Iterator<Person2> itr=sTree.iterator();
        while(itr.hasNext())
            itr.next().showData();
    }
}