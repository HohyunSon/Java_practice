package Recursion;

import java.util.Scanner;
public class RecursionSquare {
    public static int mtp(int num){
        if(num==0)
            return 1;
        else
            return 2*mtp(num-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(mtp(num));
    }
}
