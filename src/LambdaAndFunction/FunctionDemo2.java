package LambdaAndFunction;

import java.util.function.Function;

class FunctionDemo2 {
    public static void main(String[] args) {
        Function<Double, Double> cti = d -> d * 0.393701;
        Function<Double, Double> itc = d -> d * 2.54;

        System.out.println("1cm = " + cti.apply(1.0) + "inch");		// cm를 inch로
        System.out.println("1inch = " + itc.apply(1.0) + "cm");		// inch를 cm로
    }
}

/*
1cm = 0.393701inch
1inch = 2.54cm
*/