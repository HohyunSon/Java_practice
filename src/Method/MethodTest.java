package Method;

import java.util.Scanner;

class MethodTest{
    public static void dan(int a) {
        System.out.println(a + "단");
        for (int i = 1; i < 10; i++)
        {
            System.out.println(a + "*" + i + "=" + a * i);
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    dan(num);
    }
}
