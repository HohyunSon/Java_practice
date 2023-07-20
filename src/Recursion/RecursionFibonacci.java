package Recursion;

import java.util.Scanner;

public class RecursionFibonacci {
    public static int fibonacci(int num){
        if(num==0)
            return 0;
        else if (num<=2)
            return 1;
        else
            return fibonacci(num-1)+fibonacci(num-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibonacci(num));
    }
}
