package Loop;

class LoopStar2
{
    public static void main(String[] args) {
        int i =0, j=0;
        for(i=0;i<5;i++)
        {
            for(j=0;j<i;j++)
                System.out.print (" ");
            for(;j<9-i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}