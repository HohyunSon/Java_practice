package ThreadTest;

class Sum
{
    int num;
    public Sum() { num=0; }
    public void addNum(int n) { num+=n; }
    public int getNum() { return num; }
}

/*
Sum 클래스를 상속하면서 Runnable 인터페이스를 구현하고 있다. 이 인터페이스는 run
메소드 하나로 이뤄져 있다.
*/
class AdderThread extends Sum implements Runnable
{
    int start, end;

    public AdderThread(int s, int e)
    {
        start=s;
        end=e;
    }
    public void run()
    {
        for(int i=start; i<=end; i++)
            addNum(i);
    }
}

class ThreadTest2
{
    public static void main(String[] args)
    {
        AdderThread at1=new AdderThread(1, 50);
        AdderThread at2=new AdderThread(51, 100);
        Thread tr1=new Thread(at1);
        Thread tr2=new Thread(at2);
        tr1.start();
        tr2.start();
        // start 메소드의 호출을 통해서 최종으로 쓰레드를 생성 및 실행시키고 있다.

        try
        {
            tr1.join();
            tr2.join();
            // 쓰레드 인스턴스를 대상으로 join 메소드를 호출하고 있다. 이는 해당 쓰레드가 종료될 때
            // 까지 실행을 멈출 때 호출하는 메소드이다.
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("1~100까지의 합: "+(at1.getNum()+at2.getNum()));
    }
}
