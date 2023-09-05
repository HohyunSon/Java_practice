package LambdaAndFunction;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;

class SupplierDemo {
    public static List<Integer> makeIntList(Supplier<Integer> s, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(s.get());
        return list;
    }

    public static void main(String[] args) {
        Supplier<Integer> spr = () -> {
            Random rand = new Random();
            return rand.nextInt(50);
        };

        List<Integer> list = makeIntList(spr, 5);
        System.out.println(list);

        list = makeIntList(spr, 10);
        System.out.println(list);
    }
}

/*
[25, 42, 43, 23, 18]
[49, 44, 32, 5, 2, 0, 44, 36, 20, 41]
*/

/*
Supplier<T> 인터페이스에는 다음 추상 메소드가 존재한다.

T get();	// 단순히 무엇인가 반환할 때

따라서 Supplier<T> 인터페이스는 단순히 무언가를 반환해야 할 때 유용하게
사용할 수 있다.
*/