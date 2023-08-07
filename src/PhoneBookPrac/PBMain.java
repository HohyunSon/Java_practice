package PhoneBookPrac;

import java.util.Scanner;

class PBMain{
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
                case 1:
                    UI.chooseCase();
                    int choose = sc.nextInt();
                    sc.nextLine();

                    if(choose == 1)
                    {
                        UI.inputBasicInfo();
                        break;
                    }
                    else if(choose == 2)
                    {
                        UI.inputUnivInfo();
                        break;
                    }
                    else if(choose == 3)
                    {
                        UI.inputCompInfo();
                        break;
                    }
                    else{
                        UI.wrong();
                        break;
                    }

                case 2:
                    UI.searchByName();
                    break;
                case 3:
                    UI.deleteByName();
                    break;
                case 4:
                    UI.showAll();
                    break;
                case 5:
                    UI.quitProgram();
                    return;
                default:
                    UI.wrong();
                    break;
            }
        }
    }
}