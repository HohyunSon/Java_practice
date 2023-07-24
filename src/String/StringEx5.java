/*
        십진 정수를 입력받아 4바이트의 이진수로 출력하시오.

        예시
        숫자 입력
        10
        00000000000000000000000000001010
*/
package String;
import java.util.Scanner;

public class StringEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num1Binary = Integer.toBinaryString(num1);

        String form = "00000000000000000000000000000000";
        System.out.println(form.substring(num1Binary.length())+num1Binary);
    }
}
