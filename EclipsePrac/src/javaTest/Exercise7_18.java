package javaTest;


class Exercise7_18 {
    public static void action(Robot arr) {
        DanceRobot danceRobot = new DanceRobot();
        SingRobot singRobot = new SingRobot();
        DrawRobot drawRobot = new DrawRobot();
        if(arr instanceof DanceRobot)
        {
            danceRobot.dance();
        }
        else if(arr instanceof SingRobot)
        {
            singRobot.sing();
        }
        else if(arr instanceof DrawRobot)
        {
            drawRobot.draw();
        }

    }
    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i=0; i< arr.length;i++)
            action(arr[i]);
    } // main
}
class Robot {}
class DanceRobot extends Robot {
    void dance() {
        System.out.println(" 춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println(" 노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println(" 그림을 그립니다.");
    }
}