package Loop;

class Test4
{
    public static void main(String[] args) {
        int dan = 0 , i = 0;
        for(dan=2;dan<=8;dan+=2)
        {
            for(i=1;i<=dan;i++)
            {
                System.out.println(dan +"*"+ i +"="+ dan*i);
            }
            System.out.print("\n");
        }

    }
}

