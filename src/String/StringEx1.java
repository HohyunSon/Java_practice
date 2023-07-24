package String;

import java.util.Scanner;
class StringEx1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in, "EUC-KR");  // Window에서 입력받은 한글 깨질때
        String str = null;
        String str2 = null;

        System.out.println("문자열을 입력하세요.");
        str = sc.nextLine(); //엔터키까지 저장
        System.out.println("nextLine 입력받은 문자열은 " + str);

        System.out.println("문자열을 입력하세요.");
        str2 = sc.next(); //공백 혹은 엔터키까지 저장
        System.out.println("next 입력받은 문자열은 " + str2);

        int num = str2.length();//문자열의 길이를 return하는 scanner의 메소드 length
        System.out.println("str2의 문자열의 길이는 " + num);
        sc.close(); // 엑세스 해제
    }
}