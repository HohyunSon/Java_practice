package Loop;

class Test5
{
    public static void main(String[] args) {
        int a=0,b=0;
        for(b=10;b>=0;b--)
        {
            for (a=0;a<10;a++)
            {
                if(a+b==9)
                    System.out.println(""+(a*10+b)+"+"+(b*10+a)+"=99");
            }
        }
    }
}

/*
AB
BA
99
 */