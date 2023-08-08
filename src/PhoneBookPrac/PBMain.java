package PhoneBookPrac;

import java.util.Scanner;
interface finalNum{
    int INSERT_INFO = 1;
    int SEARCH_INFO = 2;
    int DELETE_INFO = 3;
    int SHOW_ALL_INFO = 4;
    int QUIT_PROGRAM = 5;

    int CHOOSE_BASIC = 1;
    int CHOOSE_UNIV = 2;
    int CHOOSE_COMPANY = 3;

    int YES = 1;
    int NO = 2;
}
class PBMain implements finalNum{


    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = UI.sc;
        PhoneInfo[] arr = new PhoneInfo[100];

        while (true) {
            int index=0;
            UI.showBase();
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println("선택 : " + menu);
            System.out.println();

            switch (menu) {
                case INSERT_INFO:
                    UI.chooseCase();
                    int choose = sc.nextInt();
                    sc.nextLine();

                    if(choose == CHOOSE_BASIC)
                    {
                        UI.inputBasicInfo();
                        break;
                    }
                    else if(choose == CHOOSE_UNIV)
                    {
                        UI.inputUnivInfo();
                        break;
                    }
                    else if(choose == CHOOSE_COMPANY)
                    {
                        UI.inputCompInfo();
                        break;
                    }
                    else{
                        UI.wrong();
                        break;
                    }

                case SEARCH_INFO:
                    UI.searchByName();
                    break;
                case DELETE_INFO:
                    UI.deleteByName();
                    break;
                case SHOW_ALL_INFO:
                    UI.showAll();
                    break;
                case QUIT_PROGRAM:
                    UI.quitProgram();
                    return;
                default:
                    UI.wrong();
                    break;
            }
        }
    }
}