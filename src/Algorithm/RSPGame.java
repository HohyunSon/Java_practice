package Algorithm;

import java.util.*;
class RSP{
    String result;
    RSP(int num){
        if(num == 1)
            result = "가위";
        else if(num == 2 )
            result = "바위";
        else if (num == 3 )
            result = "보";
    }
    public String showRSP(){
        return result;
    }
}
class RSPMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com =  (int)(Math.random()*3+1);
        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위 : 1 바위 : 2 보 : 3");
        RSP comSt = new RSP(com);

        int me = sc.nextInt();
        RSP meSt = new RSP(me);

        if(me<=3&&me>=0) {
            System.out.println("컴퓨터 : "+comSt.showRSP()+" 나 : "+meSt.showRSP());
            switch (me - com) {
                case -2, 1:
                    System.out.println("이겼습니다.");
                    break;
                case -1, 2:
                    System.out.println("졌습니다.");
                    break;
                default:
                    System.out.println("무승부입니다.");
            }
        }
        else
            System.out.println("잘못된값을 입력하셨습니다.");
    }
}