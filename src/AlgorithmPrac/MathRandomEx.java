package AlgorithmPrac;

import java.util.Scanner;

public class MathRandomEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수 사이에 있는 난수를 출력합니다.");
        System.out.println("최소값 입력");
        int min = sc.nextInt();
        System.out.println("최대값 입력");
        int max = sc.nextInt();
        System.out.println((int)(Math.random()*(max-min+1))+(min));
    }
}
