package Array;

import java.util.Scanner;

class ArrayTest3{
    public static void main(String[] args) {
        byte[][] shipBoard = {
                //1  2  3  4  5  6  7  8  9
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
                { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
                { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
        };
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("좌표를 입력하세요. (종료는00)");
            int num = sc.nextInt();
            int n1=num/10-1;
            int n2=num%10-1;
            if(num==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                if (shipBoard[n1][n2] == 0)
                    shipBoard[n1][n2] = -1;
                else if (shipBoard[n1][n2] == 1)
                    shipBoard[n1][n2] = 2;
                else
                    shipBoard[n1][n2] = 0;
                System.out.println("  123456789");
                for (int i = 0; i < shipBoard.length; i++) {
                    System.out.print(i+1+" ");
                    for (int j = 0; j < shipBoard[i].length; j++) {
                        if (shipBoard[i][j] == 0||shipBoard[i][j] == 1)
                            System.out.print(" ");
                        else if(shipBoard[i][j] == 2)
                            System.out.print("O");
                        else
                            System.out.print("X");
                    }
                    System.out.println();
                }
            }
        }

    }
}