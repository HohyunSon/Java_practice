package MethodReferences;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

class JustSort2 {
    public void sort(List<?> lst) {    // 인스턴스 메소드
        Collections.reverse(lst);
    }
}

class ArrangeList4 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);
        JustSort2 js = new JustSort2();

        Consumer<List<Integer>> c = js::sort;	// 메소드 참조 기반
        c.accept(ls);
        System.out.println(ls);
    }
}