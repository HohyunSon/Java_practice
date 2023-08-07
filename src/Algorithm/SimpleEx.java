/*
1. 사용자로 부터 임의의 정수 하나를 입력받아 그 자리수를 출력하시오.
예)
숫자를 입력하세요.
314
314는 3자리 숫자 입니다.

2. 사용자로 부터 입력받은 정수를 int형 배열로 만드시오.
*/
package Algorithm;
import java.util.*;

class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        int a = num;
        int n=0;
        while(a>0) {
            a/=10;
            n++;
        }
        System.out.println(num+"은 "+ n+"자리 숫자 입니다.");
    }
}

class Test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String tmp = String.valueOf(num);
        int[] a = new int[tmp.length()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=tmp.charAt(i)-'0';
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }
}