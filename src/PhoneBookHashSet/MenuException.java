package PhoneBookHashSet;

public class MenuException extends Exception{
    private int num;
    MenuException(int num){
        super("잘못된 번호를 입력하셨습니다.");
        this.num = num;
    }
    public void wrong(){
        System.out.println(num+"은 유효하지 않은 번호입니다.");
        System.out.println("다시 입력하세요");
    }
}
