package Method;

import java.util.Scanner;

class MethodTest1{
    public static void dan(int num1,int num2) {
        for(int j=num1;j<=num2;j++) {
            System.out.println(j + "단");
            for (int i = 1; i < 10; i++) {
                System.out.println(j + "*" + i + "=" + j * i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        dan(num1,num2);
    }
}
