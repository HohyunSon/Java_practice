/*
3. String method 실습문제.txt
        1. java.lang.String
        2. 임의의 문자열을 입력받아 문자열의 갯수 세기
        3. 임의의 문자열 두개를 입력받아 두 문자열 합치기
        4. 임의의 문자열을 입력받아 문자열을 소문자로 바꾸기
        5. 임의의 문자열을 입력받아 문자열을 대문자로 바꾸기
        6. 임의의 문자열 5개를 입력받아 알파벳 순으로 정렬
*/

package String;

import java.util.Scanner;
public class StringEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1;
        String str1,str2;
        String num3;
        String num4;
        String a1,a2,a3,a4,a5;

        num1 = sc.nextLine();
        System.out.println("입력받은 문자열의 길이는 : "+ num1.length());

        str1 = sc.nextLine();
        str2 = sc.nextLine();
        System.out.println("두 문자열을 연결하면 : "+ str1.concat(str2));

        num3 = sc.nextLine();
        System.out.println("소문자로 바꾸면 : "+num3.toLowerCase());

        num4 = sc.nextLine();
        System.out.println("대문자로 바꾸면 : "+num4.toUpperCase());

        a1 = sc.nextLine();
        a2 = sc.nextLine();
        a3 = sc.nextLine();
        a4 = sc.nextLine();
        a5 = sc.nextLine();
        String temp ;

        if(a1.compareTo(a2)>0)
        {
            temp = a1;
            a1 = a2;
            a2 = temp;
        }
        if(a1.compareTo(a3)>0)
        {
            temp = a1;
            a1 = a3;
            a3 = temp;
        }
        if(a1.compareTo(a4)>0)
        {
            temp = a1;
            a1 = a4;
            a4 = temp;
        }
        if(a1.compareTo(a5)>0)
        {
            temp = a1;
            a1 = a5;
            a5 = temp;
        }
        if(a2.compareTo(a3)>0)
        {
            temp = a2;
            a2 = a3;
            a3 = temp;
        }
        if(a2.compareTo(a4)>0)
        {
            temp = a2;
            a2 = a4;
            a4 = temp;
        }
        if(a2.compareTo(a5)>0)
        {
            temp = a2;
            a2 = a5;
            a5 = temp;
        }
        if(a3.compareTo(a4)>0)
        {
            temp = a3;
            a3 = a4;
            a4 = temp;
        }
        if(a3.compareTo(a5)>0)
        {
            temp = a3;
            a3 = a5;
            a5 = temp;
        }
        if(a4.compareTo(a5)>0)
        {
            temp = a4;
            a4 = a5;
            a5 = temp;
        }
        System.out.println("알파벳 순으로 재정렬 하면 : "+ a1 + a2 + a3 + a4 + a5);


    }
}
