package Method;
import java.util.Scanner;

public class MethodTest4 {
    public static int sum(int num)
    {
        int sum =0;
        for (int i=1;i<=num;i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sum(num);
        System.out.println(sum(num));
    }

}
