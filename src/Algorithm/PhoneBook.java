package Algorithm;

import java.util.*;
class Info{
    String name, phoneNum, birth;

    Info(String name,String phoneNum,String birth)
    {
        this.name = name;
        this.phoneNum = phoneNum;
        this.birth = birth;
    }
    public void show()
    {
        System.out.println("이름 : "+ name);
        System.out.println("전화번호 : "+phoneNum);
        System.out.println("생년월일 : "+birth);
        System.out.println();
    }
}
class Manager{
    public void search(String name){
        for(int i = 0; i< PhoneBookMain.cnt; i++)
        {
            if (name.equals(PhoneBookMain.arr[i].name))
                PhoneBookMain.arr[i].show();
        }

    }
    public void delete(String name){
        for(int i = 0; i< PhoneBookMain.cnt; i++)
        {
            Info tmp;
            if (name.equals(PhoneBookMain.arr[i].name))
            {
                System.out.println(PhoneBookMain.arr[i].name + "을 삭제합니다.");
                tmp = PhoneBookMain.arr[i];
                PhoneBookMain.cnt--;
            }
            PhoneBookMain.arr[i]= PhoneBookMain.arr[i+1];
        }
    }

}


class PhoneBookMain{
    static int cnt = 0;
    static Info[] arr = new Info[100];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("선택하세요.");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 모든 데이터 보기");
            System.out.println("5. 프로그램 종료");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println("선택 : " + menu);
            System.out.println();
            switch (menu) {
                case 1:
                    System.out.println("이름 : ");
                    String name = sc.nextLine();
                    System.out.println("전화번호 : ");
                    String phoneNum = sc.nextLine();
                    System.out.println("생년월일 : ");
                    String phone = sc.nextLine();
                    arr[cnt++] = new Info(name,phoneNum,phone);
                    break;
                case 2:
                    System.out.println("찾고싶은 이름을 입력하세요");
                    Manager SN = new Manager();
                    String searchName = sc.nextLine();
                    SN.search(searchName);
                    break;
                case 3:
                    System.out.println("데이터를 삭제할 이름을 입력하세요");
                    Manager DN = new Manager();
                    String deleteName = sc.nextLine();
                    DN.delete(deleteName);
                    break;
                case 4:
                    for(int i=0;i<cnt;i++)
                        arr[i].show();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}