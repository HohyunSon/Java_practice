package GenericPrac;

//[제네릭 메소드의 정의와 전달인자의 제한]
//다음 코드가 실행되도록 swapBox 메소드를 정의하되, Box<T> 인스턴스를 인자로 전달받을 수 있도록 정의하자.
// 단 이때 Box<T> 인스턴스의 T는 Number 또는 이를 상속하는 하위 클래스만 올 수 있도록 제한된 매개변수 선언을 하자.

class Box2<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

class BoxSwapDemo {
    // 이 위치에 swapBox 메소드 정의하자.
    public static <T extends Number> void swapBox(Box2<T> a, Box2<T> b){
        T tmp;
        tmp = a.get();
        a.set(b.get());
        b.set(tmp);
    }
    public static void main(String[] args) {
        Box2<Integer> box1 = new Box2<>();
        box1.set(99);

        Box2<Integer> box2 = new Box2<>();
        box2.set(55);

        System.out.println(box1.get() + " & " + box2.get());
        swapBox(box1, box2);	// 정의해야 할 swapBox 메소드
        System.out.println(box1.get() + " & " + box2.get());
    }
}
//    그리고 실행 결과는 다음과 같아야 한다. 즉 swapBox 메소드의 호출 결과로 인자로 전달된 두 상자 안에 저장된 내용물이 서로 바뀌어야 한다.
//        c:\JavaStudy>java BoxSwapDemo
//        99 & 55
//        55 & 99