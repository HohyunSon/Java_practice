package Loop;

class Test3
{
    public static void main(String[] args) {
        int dan = 1, i =1;
        for(i=1;i<=9;i++)
        {
            for(dan=2;dan<=9;dan++)
            {
                System.out.print(dan +"*"+ i +"="+ dan*i+ "\t");
            }
            System.out.print("\n");
        }
    }
}