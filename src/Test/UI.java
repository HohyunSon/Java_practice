package Test;
import java.util.Scanner;

public class UI implements FinalNum{
    static Scanner sc = new Scanner(System.in);
    static PB pb = PB.getPB(100);
    public static void showBase(){
        System.out.println("선택하시오");
        System.out.println("1.데이터입력");
        System.out.println("2.데이터검색");
        System.out.println("3.데이터삭제");
        System.out.println("4.전체보기");
        System.out.println("5.프로그램종료");
        System.out.println("선택>");
    }
    public static void inputGeneric(){
        System.out.println("입력합니다.");
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("번호: ");
        String phone = sc.nextLine();
        pb.inputInfo(new PBIF(name,phone));
    }
    public static void inputUniv(){
        System.out.println("입력합니다.");
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("번호: ");
        String phone = sc.nextLine();
        System.out.println("전공: ");
        String major = sc.nextLine();
        pb.inputInfo(new UNIV(name,phone,major));
    }
    public static void inputComp(){
        System.out.println("입력합니다.");
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("번호: ");
        String phone = sc.nextLine();
        System.out.println("직업: ");
        String job = sc.nextLine();
        pb.inputInfo(new COMP(name,phone,job));
    }
    public static void searchName(){
        System.out.println("검색 할 이름 입력");
        String name = sc.nextLine();
        if(pb.searchInfo(name))
            System.out.println("검색완료");
        else
            System.out.println("검색 결과 없음");
    }
    public static void deleteName(){
        System.out.println("삭제 할 번호 입력");
        String phone = sc.nextLine();
        System.out.println("정말 삭제하시려면 1번 아니면 2번");
        int num = sc.nextInt();
        sc.nextLine();
        if(num == YES) {
            if (pb.deleteInfo(phone))
                System.out.println("삭제완료");
            else
                System.out.println("삭제할 번호 없음");
        } else if (num == NO)
        {
            System.out.println("삭제를 취소합니다.");
        }
    }
    public static void showAll(){
        pb.show();
    }
    public static void quit(){
        System.out.println("프로그램을 종료합니다.");
    }
    public static void wrongNum(){
        System.out.println("잘못된 번호입니다.");
    }
    public static void selectMenu(){
        System.out.println("1.일반 2.대학 3.회사");
    }


}
