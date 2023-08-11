package Test;

public class WrongNumException extends Exception{
    WrongNumException(int num){
        super("잘못 된 번호 입력");
    }
}
