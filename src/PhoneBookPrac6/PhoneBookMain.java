package PhoneBookPrac6;

import java.util.Scanner;

public class PhoneBookMain implements FinalNum{

    public static void main(String[] args) {
        Scanner sc = PhoneBookUI.sc;
        while(true)
        {
            PhoneBookUI.showBase();
            int menu = sc.nextInt();
            try {
                if(menu < FinalNum.INSERT_INFO || menu > FinalNum.QUIT_PROGRAM)
                    throw new MenuException(menu);

                sc.nextLine();
                switch (menu) {

                    case INSERT_INFO:
                        PhoneBookUI.choose();
                        int choose = sc.nextInt();
                        sc.nextLine();
                        switch (choose) {
                            case CHOOSE_GENERIC:
                                PhoneBookUI.insertGeniricInfo();
                                break;
                            case CHOOSE_UNIV:
                                PhoneBookUI.insertUnivInfo();
                                break;
                            case CHOOSE_COMPANY:
                                PhoneBookUI.insertCompanyInfo();
                                break;
                        }
                        break;

                    case SEARCH_INFO:
                        PhoneBookUI.searchName();
                        break;
                    case DELETE_INFO:
                        PhoneBookUI.deletePhone();
                        break;
                    case SHOW_INFO:
                        PhoneBookUI.showAll();
                        break;
                    case QUIT_PROGRAM:
                        PhoneBookUI.quitProgram();
                        return;
                    default:
                        PhoneBookUI.wrongNum();
                        break;

                }
            }catch(MenuException e){
                System.out.println(e.getMessage());
                e.showWrongMenu();
            }
        }
    }
}
