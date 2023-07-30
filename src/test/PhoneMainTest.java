package test;

import java.util.Scanner;

class PhoneMainTest
{
    private static final int INSERT = 1;
    private static final int SEARCH = 2;
    private static final int DELETE = 3;
    private static final int PRINT = 4;
    private static final int QUIT = 5;
    public static void main(String[] args) {
        int select;
        Scanner sc = PhoneBookUITest.sc;
        while(true)
        {
            PhoneBookUITest.showBase();
            select = sc.nextInt();
            sc.nextLine();
            switch(select){
                case INSERT:
                    PhoneBookUITest.insertPhoneInfo();
                    break;
                case SEARCH:
                    PhoneBookUITest.searchPhoneInfo();
                    break;
                case DELETE:
                    PhoneBookUITest.deletePhoneInfo();
                    break;
                case PRINT:
                    PhoneBookUITest.showAllPhoneInfo();
                    break;
                case QUIT:
                    PhoneBookUITest.quitProgram();
                    return;
                default:
                    PhoneBookUITest.wrongSelect();
                    break;
            }
        }

    }
}