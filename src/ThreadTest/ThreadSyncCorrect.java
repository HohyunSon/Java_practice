package ThreadTest;
//synchromized 메소드를 이용하여 동기화 했을 때 (접근 막기)
class Increment2
{
    int num=0;
    public synchronized void increment2(){
        num++;
    }
    public int getNum() {
        return num;
    }
}

class IncThread2 extends Thread
{
    Increment2 inc;

    public IncThread2(Increment2 inc)
    {
        this.inc=inc;
    }
    public void run()
    {
        for(int i=0; i<10000; i++)
            for(int j=0; j<10000; j++)
                inc.increment2();
    }
}

class ThreadSyncCorrect
{
    public static void main(String[] args)
    {
        Increment2 inc=new Increment2();
        IncThread2 it1=new IncThread2(inc);
        IncThread2 it2=new IncThread2(inc);
        IncThread2 it3=new IncThread2(inc);

        it1.start();
        it2.start();
        it3.start();

        try
        {
            it1.join();
            it2.join();
            it3.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(inc.getNum());
    }
}