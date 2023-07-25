package String;
import java.util.Scanner;

public class StringEx7 {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.println("알파벳을 아스키코드로");
            char b = sc.nextLine().charAt(0);     //메소드 체이닝
            System.out.println((int)b);
    }
}
