package ExceptionPrac;

import java.util.Scanner;

class AgeInputException1 extends Exception
{
    public AgeInputException1()
    {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}

class ThrowsFromMain
{
    public static void main(String[] args) throws AgeInputException1
    {
        System.out.print("나이를 입력하세요: ");
        int age=readAge();
        System.out.println("당신은 "+age+"세입니다.");
    }

    public static int readAge() throws AgeInputException1
    {
        Scanner keyboard=new Scanner(System.in);
        int age=keyboard.nextInt();
        if(age<0)
        {
            AgeInputException1 excpt=new AgeInputException1();
            throw excpt;
        }
        return age;
    }
}