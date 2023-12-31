package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

class MyFirstStream {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};

        // 스트림 생성
        IntStream stm1 = Arrays.stream(ar);		// 배열 ar로부터 스트림 생성

        // 중간 파이프 구성
        IntStream stm2 = stm1.filter(n -> n%2 == 1);	// 중간 연산 진행

        // 최종 파이프 구성
        int sum = stm2.sum();

        System.out.println(sum);
    }
}

/*
9
*/

/*
스트림(Stream)의 이해
내부가 비어 있는 긴 파이프의 한 쪽 끝으로 물을 흘려보내면, 그 물이 다른 한쪽으로 흘러나온다.
이때 이러한 물의 흐름을 가리켜'스트림'이라 한다. 이와 유사하게 자바에서도 '데이터의 흐름을 생성할
수 있으며, 이러한 데이터의 흐름을 가리켜 '스트림'이라 한다.

필자가 다음 세 가지 종류의 파이프를 개발했다고 가정해보자. 이 파이프들의 개발 목적은 수족관의 다양한
바다 물고기들이 살기에 적합한 물을 만들어 내는데 있다.

* 정화 파이프 A형		24종의 유기 화합물을 걸러낸다.
* 정화 파이프 C형		일반 세균과 대장균 그리고 입자상의 불순물을 제거한다.
* 플랑크 파이프		물고기가 살도록 저정량의 플랑크톤을 공급하는 파이프이다.

위의 세 파이프를 하나로 연결하여 차례로 통과하도록 물을 흘려보내면 마지막 파이프의 끝에서는
물고기가 살기에 적합한 물이 흘러나온다. 그런데 파이프의 연결 순서는 다음과 같다. 순서상 플랑크 파이프를
마지막에 두어야 한다.(정화 파이프 A형과 C형의 연셜 순서는 바꿀 수 있다고 가정한다.)

정화 파이프 A형 -> 정화 파이프 C형 -> 플랑크 파이프

만약에 '플랑크 파이프'를 앞에 두면 정화 파이프들을 거치면서 플랑크톤이 걸러져 버린다. 따라서 플랑크
파이프는 항상 마지막에 위치해야 한다. 그래서 플랑크 파이프를 가리켜 '최종 파이프'라 이름을 붙이고,
반대로 정화 파이프는 끝이 아닌 앞 또는 중간에 위치해야 하므로 '중간 파이프'라 이름을 붙였다.
지금 언급한 내용의 개념이 자바의 '스트림'에도 그대로 적용된다. 우리는 다음과 같은 일을 할 수 있다.

"배열 또는 컬렉션 인스턴스에 저장된 데이터를 꺼내서 파이프에 흘려 보낸다."

이렇듯 파이프에 흘려보내는 데이터의 흐름을 가리켜 '스트림'이라 한다. 그리고 데이터를 흘려보낼 파이프의
종류는(연산의 종류는) 앞서 비유를 든 것처럼 실제로 다음 두 가지로 나뉜다.

* 중간 연산(Intermediate Operation) 마지막이 아닌 위치에서 진행이 되어야 하는 연산
* 최종 연산(Terminal Operation) 마지막에 진행이 되어야 하는 연산

스트림을 생성하고 이를 대상으로 '중간 연산'과 '최종 연산'을 진행하면, 원하는 기준으로 데이터를
필터링하고 필터링 된 데이터의 가공된 결과를 얻을 수 있다. 그것도 매우 적은 양의 코드로 말이다.

IntStream stm1 = Arrays.stream(ar);
	-> ar에 저장된 데이터를 대상으로 스트림 생성, 그리고 그 스트림을 stm1이 참조

Arrays 클래스에는 stream이라는 이름의 메소드가 다수 정의되어 있다. 그리고 이 메소드는 배열을
대상으로 스트림을 생성할 때 호출하는 메소드이다. 즉 위의 문장을 통해서 배열 ar에 저장된 데이터를
대상으로 스트림이 생성된다. 그리고 그 스트림을 참조변수 stm1이 참조하는 상황이다. 참고로 스트림은
데이터의 복사본이라 생각하면 된다. 그것도 중간 연산과 최종 연산을 진행하기 좋은 구조로 배치된
복사본이라 생각하면 된다.
이어서 다음 문장르 보자. 이 문장은 stm1이 참조하는 스트림을 filter라는 파이프에 통과시키는
방법을 보여준다.(사실 stm1을 대상으로 'filter라는 연산을 진행한다.'는 것이 정확한 표현이다.)

IntStream stm2 = stm1.filter(n->n%2==1);
	-> stm1이 참조하는 스트림을 대상으로 filter 연산 진행

위의 문장을 실행하고 나면, filter 연산을 통과하면서 걸러진 스트림을 stm2가 참조하게 된다.
그런데 위의 파이프는(연산은) 홀수 데이터만 통과하도록 설계되었다. 즉 짝수는 걸러지고 홀수만 통과하여
이들로 다시 스트림이 형성된다.

끝으로 다음 문장을 보자. 이 문자에서는 홀수로만 이뤄진 stm2가 참조하는 스트릠을 대상으로 최종연산인
(마지막에 연결하는 파이프인) sum을 진행하고 있다.

int sum = stm2.sum();

최종 연산인 sum은 스트림의 데이터를 모두 더하고 그 결과를 반환하는 연산이다. 정리하면, 위의 예제에서는
배열에 저장된 데이터로 스트림을 생성하여 짝수를 걸러내는 파이프와 스트림의 모든 데이터를 더하는 파이프를
통과시켜 '홀수의 합'을 계산하였다.

파이프는 연산입니다.
'스트림'이라는 개념의 관점에서 '최종 연산'은 마지막에 연결하는 파이프를 의미하고, '중간 연산'은 끝이
아닌 처음 또는 중간에 연결하는 파이프를 의미한다.
*/