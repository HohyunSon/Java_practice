package ClassPractice;

import java.util.Scanner;
class RSPgame
{
    String result;
    RSPgame(int num){
        if (num==1)
            result = "가위";
        else if (num == 2)
            result = "바위";
        else
            result = "보";
    }
    public String print(){
        return result;
    }
}
class RSPMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = (int)(Math.random()*3+1);
        int point = 0 ;
        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위 : 1 , 바위 : 2 , 보 : 3");
        int player=sc.nextInt();
        RSPgame comSt = new RSPgame(com);
        RSPgame playerSt = new RSPgame(player);

        int battle = com - player;


        switch (battle) {
            case 2,-1 :
                point++;
                System.out.println("이겼습니다. 컴 : "+comSt.print()+" "+"나 : "+playerSt.print()+" 포인트는 " + point);
                break;
            case 1,-2 :
                point--;
                System.out.println("졌습니다. 컴 : "+comSt.print()+" "+"나 : "+playerSt.print()+" 포인트는 " + point);
                break;
            case 0:
                System.out.println("비겼습니다. 컴 : "+comSt.print()+" "+"나 : "+playerSt.print()+" 포인트는 " + point);
                break;
        }
    }
}

// 컴 보 나 가위 3,1         2이김
//컴 가위 나 바위 1,2         -1 이김
//컴 바위 나 보 2,3          -1 이김
//컴 보 나 바위 3,2          1짐
//컴 가위 나 보 1,3          -2 짐
// 컴 바위 나 가위 2,1          1짐

