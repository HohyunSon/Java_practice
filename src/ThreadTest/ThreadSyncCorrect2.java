package ThreadTest;
//synchronized 박스를 이용하여 동기화 했을 때 (접근 막기)
class Increment3
{
    int num=0;
    public void increment(){
        synchronized(this)
        {
            num++;
        }
    }
    public int getNum() { return num; }
}

class IncThread3 extends Thread
{
    Increment3 inc;

    public IncThread3(Increment3 inc)
    {
        this.inc=inc;
    }
    public void run()
    {
        for(int i=0; i<10000; i++)
            for(int j=0; j<10000; j++)
                inc.increment();
    }
}

class ThreadSyncCorrect2
{
    public static void main(String[] args)
    {
        Increment3 inc=new Increment3();
        IncThread3 it1=new IncThread3(inc);
        IncThread3 it2=new IncThread3(inc);
        IncThread3 it3=new IncThread3(inc);

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