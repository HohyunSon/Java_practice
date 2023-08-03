package Array;

import java.util.*;
class ArrayTest4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] num = new int[5][5];
        int cnt=1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = cnt++;
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                int rand = (int) (Math.random() * 5);
                int rand2 = (int) (Math.random() * 5);
                int tmp;
                tmp = num[i][j];
                num[i][j] = num[rand][rand2];
                num[rand][rand2] = tmp;
            }
        }
        while(true) {
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + "\t");
                }
                System.out.println();
            }
            int n = sc.nextInt();
            if(n==0) {
                System.out.println("종료합니다.");
                break;
            }
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    if (num[i][j] == n)
                        num[i][j] = 0;
                }
            }

        }

    }
}
