package ThreadTest;

class ShowThread extends Thread{
    public ShowThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        int i = 0;
        while(i<100)
        {
            System.out.println(getName());
            i++;
            try{
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadTest1 {
    public static void main(String[] args) {
        ShowThread t1 = new ShowThread("멋진쓰레드");
        ShowThread t2 = new ShowThread("예쁜쓰레드");
        t1.start();
        t2.start();
    }
}