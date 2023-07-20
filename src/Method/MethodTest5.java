package Method;
import java.util.Scanner;

public class MethodTest5 {
    public static int sum(int num1,int num2)
    {
        int sum =0;
        for (int i=num1;i<=num2;i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum(num1, num2);
        System.out.println(sum(num1,num2));
    }

}
