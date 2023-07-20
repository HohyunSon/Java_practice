package Recursion;
import java.util.Scanner;

public class RecursionBinary {
    public static void bin(int num){
        if(num == 0)
            return;
        else {
            bin(num / 2);
            System.out.print(num%2); //반대로 출력하기 위해 print 를 bin아래에다 구성
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        bin(num);
    }
}
