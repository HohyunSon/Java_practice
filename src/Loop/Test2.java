package Loop;

class Test2
{
    public static void main(String[] args) {
        int dan = 1, i =1;
        for(dan=2;dan<=9;dan++)
        {
            System.out.println(dan+"단");
            for(i=2;i<=9;i++)
            {
                System.out.println(dan +"*"+ i +"="+ dan*i);
            }
            System.out.print("\n");
        }
    }
}