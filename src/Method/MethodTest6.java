package Method;
import java.util.Scanner;

public class MethodTest6 {
    public static void fac(int num)
    {
        int fac =1;
        for (int i=1;i<=num;i++) {
            fac *= i;
        }
        System.out.println(fac);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fac(num);
    }

}
