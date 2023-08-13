package PhoneBook;

import java.util.Scanner;

public class PhoneBookMain implements FinalNum{
    public static void main(String[] args) {
        Scanner sc = PhoneBookUI.sc;
        while(true)
        {
            try {
                PhoneBookUI.showBase();
                int menu = sc.nextInt();
                if(menu < INSERT_INFO || menu > QUIT_PROGRAM)
                    throw new MenuException(menu);
                sc.nextLine();
                switch (menu) {
                    case INSERT_INFO:
                        PhoneBookUI.choiceSelect();
                        int select = sc.nextInt();
                        sc.nextLine();
                        switch (select) {
                            case SELECT_GENERIC:
                                PhoneBookUI.insertGeneric();
                                break;
                            case SELECT_UNIV:
                                PhoneBookUI.insertUniv();
                                break;
                            case SELECT_COMPANY:
                                PhoneBookUI.insertCompany();
                                break;
                            default:
                                PhoneBookUI.wrongNum();
                                break;
                        }
                        break;
                    case SEARCH_INFO:
                        PhoneBookUI.searchInfo();
                        break;
                    case DELETE_INFO:
                        PhoneBookUI.deleteInfo();
                        break;
                    case SHOW_ALL:
                        PhoneBookUI.showAll();
                        break;
                    case QUIT_PROGRAM:
                        PhoneBookUI.quitProgram();
                        return;
                    default:
                        PhoneBookUI.wrongNum();
                        break;
                }
            }catch (MenuException e){
                System.out.println(e.getMessage());
                e.wrong();
            }

        }
    }
}
