package MethodReferences;

import java.util.function.ToIntBiFunction;

class IBox2 {
    private int n;

    public IBox2(int i) { n = i; }

    public int larger(IBox2 b) {
        if(n > b.n)
            return n;
        else
            return b.n;
    }
}

class NoObjectMethodRef2 {
    public static void main(String[] args) {
        IBox2 ib1 = new IBox2(5);
        IBox2 ib2 = new IBox2(7);

        // 두 상자에 저장된 값 비교하여 더 큰 값 반환
        ToIntBiFunction<IBox2, IBox2> bf = IBox2::larger;
        int bigNum = bf.applyAsInt(ib1, ib2);
        System.out.println(bigNum);}
}

// 7

// ToIntBiFunction<T, U>	int applyAsInt(T t, U u)