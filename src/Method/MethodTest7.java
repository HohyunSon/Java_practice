package Method;
import java.util.Scanner;

public class MethodTest7 {
    public static boolean primeNumber(int num)
    {
        int i =0;
        if(num<=1)
            return false;
        else {
            for (i = 2; i < num; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(primeNumber(num));
    }

}
