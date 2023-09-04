package LambdaTest;

import java.util.List;
import java.util.Arrays;
import java.util.function.IntPredicate;

class IntPredicateDemo {
    public static int sum(IntPredicate ip, List<Integer> lst) {
        int s = 0;

        for(int n : lst) {
            if(ip.test(n))
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
Predicate<T>를 구체화하고 다양화 한 인터페이스들

Predicate<T>에서 T를 다음과 같이 기본 자료형으로 결정하여 정의한 인터페이스들도 존재한다. 이들은 함수형 인터페이스이지만 제네릭은 아니다. 그리고 마찬가지로 패키지 java.util.function으로 묶여 있다.

IntPredicate 		boolean test(int value)
LongPredicate		boolean test(long value)
DoublePredicate		boolean test(double value)

그리고 Predicate<T>와 달리 두 개의 인자를 받아서 true 또는 false를 결정할 수 있는 다음 제네릭 인터페이스도 정의되어 있다.

BiPredicate<T, U>		boolean(T t, U u)

다음 네 가지 대표적인 함수형 인터페이스를 잘 아는 것이 중요하다.

Predicate<T>, Supplier<T>, Consumer<T>, Function<T, R>

이들 네 가지 함수형 인터페이스에 익숙해지면 이들의 형제들은 필요할 때 얼마든지 쉽게 활용할 수 있다.
*/