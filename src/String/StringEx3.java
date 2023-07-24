package String;

import java.util.Scanner;
class StringEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1,str2;

        System.out.println("첫번째 문자열 입력하세요");
        str1 = sc.nextLine();
        System.out.println("두번째 문자열 입력하세요");
        str2 = sc.nextLine();
        int num = str1.compareTo(str2);
        System.out.println(num);
    }
}
