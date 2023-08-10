package PhoneBookPrac6;
import java.util.Scanner;

public class PhoneBookUI implements FinalNum {
    static Scanner sc = new Scanner(System.in);
    private static PhoneBook pb = PhoneBook.getPhoneBook(100);

    public static void showBase(){
        System.out.println("선택하세요");
        System.out.println("1.데이터입력");
        System.out.println("2.데이터검색");
        System.out.println("3.데이터삭제");
        System.out.println("4.모든데이터");
        System.out.println("5.프로그램 종료");
        System.out.println("선택 : ");
    }
    public static void insertGeniricInfo(){
        System.out.println("데이터입력 시작");
        System.out.println("이름 ");
        String name = sc.nextLine();
        System.out.println("번호 ");
        String phone = sc.nextLine();
        pb.inputPhoneInfo(new PhoneBookInfo(name,phone));
    }
    public static void insertUnivInfo(){
        System.out.println("데이터입력 시작");
        System.out.println("이름 ");
        String name = sc.nextLine();
        System.out.println("번호 ");
        String phone = sc.nextLine();
        System.out.println("전공 ");
        String major = sc.nextLine();
        pb.inputPhoneInfo(new UnivPhoneBook(name,phone,major));
    }
    public static void insertCompanyInfo(){
        System.out.println("데이터입력 시작");
        System.out.println("이름 ");
        String name = sc.nextLine();
        System.out.println("번호 ");
        String phone = sc.nextLine();
        System.out.println("회사 ");
        String company = sc.nextLine();
        pb.inputPhoneInfo(new CompanyPhoneBook(name,phone,company));
    }
    public static void searchName(){
        System.out.println("검색할 이름을 입력하세요");
        String name = sc.nextLine();
        if(!pb.search(name))
            System.out.println("검색한 이름 없음");
    }
    public static void deletePhone(){
        System.out.println("삭제할 번호를 입력하세요");
        String phone = sc.nextLine();
        System.out.println("정말 삭제하시겠습니까? 1.YES 2.NO");
        int num = sc.nextInt();
        sc.nextLine();
        if(num == YES) {
            if(pb.deletePhone(phone))
                System.out.println("삭제완료");
            else
                System.out.println("검색한 번호 없음");
        }
        else if (num == NO)
            System.out.println("취소되었습니다.");
    }
    public static void showAll(){
        pb.showAll();
    }
    public static void choose(){
        System.out.println("1.일반 2.대학 3.회사");
    }
    public static void quitProgram(){
        System.out.println("프로그램을 종료합니다.");
    }
    public static void wrongNum(){
        System.out.println("잘못된 번호입니다.");
    }
}
