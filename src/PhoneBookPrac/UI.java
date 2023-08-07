package PhoneBookPrac;

import java.util.Scanner;

class UI{
    private static PhoneBook pb = PhoneBook.getPhoneBook(100);
    static Scanner sc = new Scanner(System.in);
    public static void showBase(){
        System.out.println();
        System.out.println("선택하세요.");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
    }
    public static void chooseCase(){
        System.out.println("1.일반 2.대학 3.회사");
    }
    public static void inputBasicInfo(){
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("전화번호 : ");
        String phoneNum = sc.nextLine();
        System.out.println("데이터 입력 완료");
        pb.inputPhoneInfo(new PhoneInfo(name,phoneNum));
    }
    public static void inputUnivInfo(){
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("전화번호 : ");
        String phoneNum = sc.nextLine();
        System.out.println("전공 : ");
        String major = sc.nextLine();
        System.out.println("학년 : ");
        String year = sc.nextLine();
        pb.inputPhoneInfo(new PhoneUnivInfo(name,phoneNum,major,year));
    }
    public static void inputCompInfo(){
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("전화번호 : ");
        String phoneNum = sc.nextLine();
        System.out.println("회사 : ");
        String company = sc.nextLine();
        pb.inputPhoneInfo(new PhoneCompanyInfo(name,phoneNum,company));
    }
    public static void searchByName(){
        System.out.println("찾고싶은 이름을 입력하세요");
        String searchName = sc.nextLine();
        pb.searchInfo(searchName);
    }
    public static void deleteByName(){
        System.out.println("데이터를 삭제할 이름을 입력하세요");
        String deleteName = sc.nextLine();
        pb.deleteInfo(deleteName);
        System.out.println("삭제가 완료되었습니다.");
    }
    public static void showAll(){
        pb.showAll();
    }
    public static void quitProgram(){
        System.out.println("프로그램을 종료합니다.");
    }
    public static void wrong(){
        System.out.println("잘못입력하셨습니다.");
    }
}
