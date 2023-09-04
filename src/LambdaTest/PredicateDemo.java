package LambdaTest;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

class PredicateDemo {
    public static int sum(Predicate<Integer> p, List<Integer> lst) {
        int s = 0;

        for(int n : lst) {
            if(p.test(n))
                s += n;
        }

        return s;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);

        int s;
        s = sum(n -> n%2 == 0, list);
        System.out.println("짝수 합: " + s);

        s = sum(n -> n%2 != 0, list);
        System.out.println("홀수 합: " + s);

    }
}

/*
짝수 합: 12
홀수 합: 33
*/

/*
	정의되어 있는 함수형 인터페이스

미리 정의되어 잇는 함수형 인터페이스

다음은 Collection<E> 인터페이스에 정의되어 있는 디폴트 메소드 중 하나인 removeIf 메소드이다.

default boolean removeIf(Predicate<? super E> filter)

이 메소드를 사용하기 위해서는 다음 매개변수 선언이 의미하는 바를 알아야 한다.

Predicate<? super E> filter

보다 정확히는 Predicate가 무언인지 알아야 한다. Predicate는 다음과 같이 정의되어 있는 '제네릭 인터페이스'이자 '함수형 인터페이스'이다.(아래의 인터페이스 정의에서 static, default 선언이 붙은 메소드의 정의는 생략하였다.)

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}

표준으로 정의된 대표적인 함수형 인터페이스 네 개와 그 안에 위치한 추상 메소드는 다음과 같다. 그리고 이들은 모두 java.util.function 패키지로 묶여 있다.

Predicate<T> boolean test(T t)
Supplier<T> T get()
Consumer<T> void accept(T t)
Function<T, R> R apply(T t)


*/