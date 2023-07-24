/*
        1. 사용자로 부터 영숫자를 입력받아 대문자이면 '대문자', 소문자이면 '소문자', 숫자이면 '숫자'라고 출력.

        예시)
        영숫자 입력
        A
        A는 대문자

        영숫자 입력
        b
        b는 소문자

        영숫자 입력
        3
        3은 숫자

        영숫자 입력
        %
        입력한 값은 영숫자가 아닙니다.

        2. 영문자하나를 입력받아, 소문자는 대문자로, 대문자는 소문자로 출력하시오.
*/
package String;

import java.util.Scanner;

public class StringEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영숫자 입력");
        char test1 = sc.nextLine().charAt(0);

        if (test1<=122&&test1>=97)
            System.out.println(test1+"은 소문자");
        else if(test1<=90 && test1>=65)
            System.out.println(test1+"은 대문자");
        else if(test1<=57 && test1>=48)
            System.out.println(test1+"은 숫자");
        else
            System.out.println("입력한 값은 영숫자가 아닙니다.");

        System.out.println("대소문자 변환기 (영문자 하나 입력)");
        String test2 = sc.nextLine();
        if(test2.equals(test2.toUpperCase()))
            System.out.println(test2.toLowerCase());
        else
            System.out.println(test2.toUpperCase());
        sc.close();
    }
}
