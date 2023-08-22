package GenericPrac;

/*
[제네릭 클래스 정의하기]
문제1
다음은 앞서 예제에서 작성한 수납공간이 둘로 나눠져 있는 상자를 표현한 제네릭 클래스이다.


이어서 수납공간이 둘로 나눠져 있는 상자를 표현한 클래스를 DDBox<U, D>라는 이름으로 하나 더 정의하여 DBox<L, R> 인스턴스 둘을 이 상자에 저장하고자 한다. 그럼 다음 main 메소드를 기반으로 컴파일 및 실행이 가능하도록 DDBox<U, D> 제네릭 클래스를 정의해보자.


그리고 위 main 메소드의 실행 결과로 다음의 출력을 보이게 하자.(출력 형태는 이와 달라도 괜찮다. 내용물만 전부 출력이 되면 된다.)
c:\JavaStudy>java DDBoxDemo
Apple & 25
Orange & 33

문제2
문제1의 내용에 해당하는 프로그램은 사실 별도의 클래스를 정의하지 않고 DBox 하나로 충분히 편성할 수 있다. 따라서 이번에는 문제 1의 내용과 결과를 보이는 프로그램을 작성하되 DBox 클래스 하나만 활용하여 작성해보자.(상자에 담긴 내용물의 출력 형태는 달라도 괜찮다. 내용물만 전부 출력이 되면 된다.)
 */
class DBox2<L, R>{
    private L left;
    private R right;
    public void set(L o, R r) {
        left = o;
        right = r;
    }
    public String toString() { return left + " & " + right; }
}

class BoxInBoxTest2{
    public static void main(String[] args){
        DBox2<String, Integer> box1 = new DBox2<>();
        box1.set("Apple", 25);
        DBox2<String, Integer> box2 = new DBox2<>();
        box2.set("Orange", 33);
        DBox2<DBox2<String, Integer>, DBox2<String, Integer>> dbox2 = new DBox2<>();
        dbox2.set(box1, box2);	// 두 개의 상자를 하나의 상자에 담음
        System.out.println(dbox2);	// 상자의 내용물 출력
    }
}