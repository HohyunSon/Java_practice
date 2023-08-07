package Inheritance;

/*
1. 다음을 프로그램 하시오.

        Friend 클래스
        showData : 모든 데이터(전체 제이터)를 출력하는 메소드
        showBasicInfo : 기본 데이터(일부 데이터)를 출력하는 메소드

        HighFriend 클래스 (Friend 클래스 상속)
        showData : 모든 데이터(전체 제이터)를 출력하는 메소드
        showBasicInfo 메소드에서 이름, 전화번호, 직장을 출력

        UnivFriend 클래스 (Friend 클래스 상속)
        showData : 모든 데이터(전체 제이터)를 출력하는 메소드 :이름 전번 주소 전공
        showBasicInfo 메소드에서 이름과 전공학과를 출력 : 이름 전공

        *** 메뉴 선택 ***
        1. 고교 정보 저장
        2. 대학 친구 저장
        3. 전체 정보 출력
        4. 전체 기본 정보 출력
        5. 프로그램 종료
        선택>>
*/
import java.util.*;
abstract class Friend//추상클래스로 만들어준다.(객체 생성X)
{
    private String name,phone,adress;

    Friend(String name,String phone,String adress){
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getAdress(){
        return adress;
    }
    public void showData(){
        System.out.println("이름:" + name);
        System.out.println("전화번호:" + phone);
        System.out.println("주소:"+adress);
    }
    public void showBasicInfo(){}
}
class HighFriend extends Friend {
    private String comp;
    HighFriend(String name,String phone,String adress,String comp) {
        super(name, phone, adress);
        this.comp = comp;
    }
    public void showData(){
        super.showData();
        System.out.println("직장:" + comp);
    }
    public void showBasicInfo(){
        super.showBasicInfo();
        System.out.println("직장:" + comp);
    }
}
class UnivFriend extends Friend {
    private String major;
    UnivFriend(String name,String phone,String adress,String major) {
        super(name, phone, adress);
        this.major = major;
    }
    public void showData(){
        super.showData();
        System.out.println("전공:" + major);

    }
    public void showBasicInfo(){
        super.showBasicInfo();
        System.out.println("전공:" + major);
    }
}

class UI{
    static Scanner sc = new Scanner(System.in);
    public static void showBase(){
        System.out.println("*** 메뉴 선택 ***");
        System.out.println("1. 고교 정보 저장");
        System.out.println("2. 대학 친구 저장");
        System.out.println("3. 전체 정보 출력");
        System.out.println("4. 전체 기본 정보 출력");
        System.out.println("5. 프로그램 종료");
        System.out.println("선택>>");
    }
    public static void quitProgram(){
        System.out.println("프로그램을 종료합니다.");
    }
    public static void wrongMenu(){
        System.out.println("잘못입력하셨습니다.");
    }

}
class FriendMain{
    private static final int HIGH_INPUT = 1;
    private static final int UNIV_INPUT = 2;
    private static final int SHOW_ALL = 3;
    private static final int SHOW_BASIC_ALL = 4;
    private static final int QUIT = 5;

    public static void main(String[] args) {
        Scanner sc = UI.sc;
        int cnt=0;
        Friend[] frdArr = new Friend[100];

        while(true) {
            UI.showBase();
            String name,phone,adress,comp,major;
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu)
            {
                case HIGH_INPUT:
                    System.out.println("고교 정보를 입력합니다.");
                    System.out.println("이름: ");
                    name = sc.nextLine();
                    System.out.println("전화번호:");
                    phone = sc.nextLine();
                    System.out.println("주소:");
                    adress = sc.nextLine();
                    System.out.println("직장:");
                    comp = sc.nextLine();
                    frdArr[cnt++] = new HighFriend(name,phone,adress,comp);
                    break;
                case UNIV_INPUT:
                    System.out.println("대학 정보를 입력합니다.");
                    System.out.println("이름: ");
                    name = sc.nextLine();
                    System.out.println("전화번호:");
                    phone = sc.nextLine();
                    System.out.println("주소:");
                    adress = sc.nextLine();
                    System.out.println("전공:");
                    major = sc.nextLine();
                    frdArr[cnt++] = new UnivFriend(name,phone,adress,major);
                    break;
                case SHOW_ALL:
                    for(int i=0;i<cnt;i++) {
                        frdArr[i].showData();
                        System.out.println();
                    }
                    break;
                case SHOW_BASIC_ALL:
                    for(int i=0;i<cnt;i++) {
                        frdArr[i].showBasicInfo();
                        System.out.println();
                    }
                    break;
                case QUIT:
                    UI.quitProgram();
                    return;
                default:
                    UI.wrongMenu();
                    break;
            }
        }
    }
}