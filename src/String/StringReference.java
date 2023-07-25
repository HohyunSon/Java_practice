package String;
class SimpleAdder
{
    private int num;
    public SimpleAdder(){num=0;}

    public SimpleAdder add(int num)
    {
        this.num+=num;
        return this;
    }
    public void showResult()
    {
        System.out.println("add result: "+num);
    }
}
public class StringReference {
    public static void main(String[] args) {
        SimpleAdder adder =new SimpleAdder();
        adder.add(3).add(4).add(5).showResult();
    }

}
