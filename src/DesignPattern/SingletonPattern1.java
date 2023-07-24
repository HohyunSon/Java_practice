package DesignPattern;

class SimpleNumber1
{
    private static SimpleNumber1 inst = new SimpleNumber1();
    int num=0;
    private SimpleNumber1() {}	// 생성자 private
    public  void addNum(int n) { num += n; }
    public  void showNum()
    {
        System.out.println(num);
    }

    public static SimpleNumber1 getSimpleNumberInst()
    {
        return inst;
    }
}

class OnlyOneINstance1
{
    public static void main(String[] args)
    {
        SimpleNumber1 num1 = SimpleNumber1.getSimpleNumberInst();
        num1.addNum(20);

        SimpleNumber1 num2 = SimpleNumber1.getSimpleNumberInst();
        num2.addNum(30);

        num1.showNum();
        num2.showNum();
    }
}