package Recursion;

import java.util.Scanner;
public class RecursionSum {
    public static int sum(int num) {
        if(num == 0)
            return 0;
        else
            return num+sum(num-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));

    }
}
