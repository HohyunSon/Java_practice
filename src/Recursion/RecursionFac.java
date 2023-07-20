package Recursion;

import java.util.Scanner;
public class RecursionFac {
    public static int fac(int num) {
        if (num == 0)
            return 1;
        else
            return num*fac(num-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fac(num));

    }
}
