package InterfacePrac;

/*
print 메소드에 다음의 기능을 추가하시오.
"인터페이스 UpperCasePrintable을 구현하는 클래스의 인스턴스가
print 메소드의 인자로 전달되면 문자열을 전부 대문자로 출력한다."

[실행결과]
[X POS:1, Y POS:1]
[x pos:2, y pos:2]
[X POS:3, Y POS:3]
[x pos:4, y pos:4]
*/
interface UpperCasePrintable // 마커 인터페이스
{

}
class PointUp implements UpperCasePrintable {
    private int xPos, yPos;

    PointUp(int x, int y)
    {
        xPos=x;
        yPos=y;
    }

    public String toString()
    {
        String posInfo="[x pos:"+xPos + ", y pos:"+yPos+"]";
        return posInfo;
    }
}
class ClassPrinter
{

    public static void print(Object obj){
        String org=obj.toString();
        if(obj instanceof UpperCasePrintable)
        {
            org=org.toUpperCase();
        }

        System.out.println(org);
    }
}

class Point
{
    private int xPos, yPos;

    Point(int x, int y)
    {
        xPos=x;
        yPos=y;
    }

    public String toString()
    {
        String posInfo="[x pos:"+xPos + ", y pos:"+yPos+"]";
        return posInfo;
    }
}

class ImplObjectPrintln
{
    public static void main(String[] args)
    {
        PointUp pos1=new PointUp(1, 1);
        Point pos2=new Point(2, 2);
        PointUp pos3=new PointUp(3, 3);
        Point pos4=new Point(4, 4);

        ClassPrinter.print(pos1);
        ClassPrinter.print(pos2);
        ClassPrinter.print(pos3);
        ClassPrinter.print(pos4);
    }
}