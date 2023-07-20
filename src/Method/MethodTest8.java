package Method;
public class MethodTest8 {
    public static boolean primeNumber(int num)
    {
        if(num<=1)
            return false;
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        for(int i=2;i<=100;i++) {
            if (primeNumber(i))
                System.out.println(i);
        }
    }

}
