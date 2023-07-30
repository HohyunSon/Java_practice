package test;

import java.util.Scanner;
class PhoneBookUITest
{
    public static Scanner sc = new Scanner(System.in);
    private static PhoneBookTest pb = PhoneBookTest.getPhoneInfo(100);

    public static void showBase(){
        System.out.println("선택하세요");
        System.out.println("1.입력");
        System.out.println("2.검색");
        System.out.println("3.삭제");
        System.out.println("4.출력");
        System.out.println("5.종료");
        System.out.println("선택 : ");
    }
    public static void insertPhoneInfo(){
        if(!pb.checkCnt())
        {
            System.out.println("저장공간이 부족합니다.");
            return;
        }
            String name, phone, birth;
            System.out.println("입력을 시작합니다.");
            System.out.println("이름 : ");
            name = sc.nextLine();
            System.out.println("번호 : ");
            phone = sc.nextLine();
            System.out.println("생일 : ");
            birth = sc.nextLine();
            pb.insertPhoneInfo(name, phone, birth);
            System.out.println("입력완료 ");
    }
    public static void searchPhoneInfo(){
        String name;
        System.out.println("검색할 이름 입력");
        name = sc.nextLine();
        if(!pb.searchPhoneInfoByName(name))
            System.out.println("일치하는 정보 없음");
    }
    public static void deletePhoneInfo(){
        String phone;
        System.out.println("삭제할 번호 입력");
        phone = sc.nextLine();
        if(!pb.deletePhoneInfo(phone))
            System.out.println("일치하는 정보 없음");
    }
    public static void showAllPhoneInfo(){
        System.out.println("모든 정보 출력...");
        pb.showAllPhoneInfo();
    }
    public static void quitProgram(){
        System.out.println("프로그램 종료..");
    }
    public static void wrongSelect(){
        System.out.println("잘못 입력하셨습니다.");
    }
}