package PhoneBookPrac6;

public class MenuException extends Exception{
    private int choice;
    MenuException(int choice)
    {
        super("유효하지 않은 번호입니다.");
        this.choice = choice;
    }
    public void showWrongMenu(){
        System.out.println(choice+"는 잘못된 번호입니다.");
        System.out.println("메뉴 선택을 다시합니다.");
    }
}
