package ThreadTest;

import java.util.concurrent.locks.ReentrantLock;

class IHaveTwoNum2
{
    private final ReentrantLock r1 = new ReentrantLock();
    private final ReentrantLock r2 = new ReentrantLock();
    int num1=0;
    int num2=0;

    public void addOneNum1()
    {
        r1.lock();
        try {
            num1 += 1;
        }
        finally {
            r1.unlock();
        }
    }
    public void addTwoNum1()
    {
        r1.lock();
        try {
            num1 += 2;
        }
        finally {
            r1.unlock();
        }
    }
    public void addOneNum2()
    {
        r2.lock();
        try{
            num2+=1;
        }
        finally {
            r2.unlock();
        }
    }
    public void addTwoNum2()
    {
        r2.lock();
        try
        {
            num2+=2;
        }
        finally {
            r2.unlock();
        }
    }

    public void showAllNums()
    {
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    Object key1=new Object();
    Object key2=new Object();
}

class AccessThread2 extends Thread
{
    IHaveTwoNum2 twoNumInst;

    public AccessThread2(IHaveTwoNum2 inst)
    {
        twoNumInst=inst;
    }

    public void run()
    {
        twoNumInst.addOneNum1();
        twoNumInst.addTwoNum1();

        twoNumInst.addOneNum2();
        twoNumInst.addTwoNum2();
    }
}

class UseReentrantLock
{
    public static void main(String[] args)
    {
        IHaveTwoNum2 numInst=new IHaveTwoNum2();

        AccessThread2 at1=new AccessThread2(numInst);
        AccessThread2 at2=new AccessThread2(numInst);

        at1.start();
        at2.start();

        try
        {
            at1.join();
            at2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        numInst.showAllNums();
    }
}