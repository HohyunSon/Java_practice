package PhoneBook;

import java.util.Scanner;

public class PhoneBookUI implements FinalNum {
    static Scanner sc = new Scanner(System.in);
    private static PhoneBook pb = PhoneBook.getPhoneBook(100);
    public static void showBase(){
        System.out.println("선택하세요");
        System.out.println("1.데이터입력");
        System.out.println("2.데이터검색");
        System.out.println("3.데이터삭제");
        System.out.println("4.전체보기");
        System.out.println("5.프로그램종료");
        System.out.println("선택 -> ");
    }
    public static void insertGeneric(){
        System.out.println("입력하세요");
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("번호 : ");
        String phone = sc.nextLine();
        pb.insertInfo(new PhoneBookInfo(name,phone));
    }
    public static void insertUniv(){
        System.out.println("입력하세요");
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("번호 : ");
        String phone = sc.nextLine();
        System.out.println("전공 : ");
        String major = sc.nextLine();
        pb.insertInfo(new PhoneBookUnivInfo(name,phone,major));
    }
    public static void insertCompany(){
        System.out.println("입력하세요");
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("번호 : ");
        String phone = sc.nextLine();
        System.out.println("직업 : ");
        String job = sc.nextLine();
        pb.insertInfo(new PhoneBookCompInfo(name,phone,job));
    }
    public static void searchInfo(){
        System.out.println("검색할 이름 입력");
        String name = sc.nextLine();
        pb.searchInfo(name);
    }
    public static void deleteInfo(){
        System.out.println("삭제할 번호 입력");
        String phone = sc.nextLine();
        System.out.println("정말 삭제하시겠습니까? 1.삭제 2.취소");
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose)
        {
            case YES:
                if(pb.deleteInfo(phone))
                    System.out.println("삭제완료");
                else
                    System.out.println("삭제할 번호 없음");
                break;
            case NO:
                System.out.println("삭제를 취소합니다.");
                break;
            default:
                wrongNum();
        }
    }
    public static void showAll(){
        pb.showAll();
    }
    public static void choiceSelect(){
        System.out.println("1.일반 2.대학 3.회사");
    }
    public static void wrongNum(){
        System.out.println("잘못된 번호입력");
    }
    public static void quitProgram(){
        System.out.println("프로그램을 종료합니다..");
    }
}
