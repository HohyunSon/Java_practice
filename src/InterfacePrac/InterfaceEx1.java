package InterfacePrac;

/*
인터페이스를 이용해서 상속을 대신하기
        폴더에 있는 MultiInheriAlternative.java에서는 다중상속을 어떻게 인터페이스가 대신하는지를 보이고 있다. 이 예제에서 보이는 내용을 참조하여, 이 예제의 IPTV 클래스를 다음의 형태로 변경하자.
class IPTV implements TV, Computer
{
	. . .
}
    그나마 있던 TV 클래스의 상속도 인터페이스의 구현으로 변경하라는 뜻이다. 물론 예제의 main 메소드에는 변경이 없어야 하며, 실행결과도 동일해야 한다.*/
interface TV
{
    public void onTV();
}

interface Computer
{
    public void dataReceive();
}

class ComputerImpl
{
    public void dataReceive()
    {
        System.out.println("영상 데이터 수신 중");
    }
}

class TVImpl
{
    public void onTV()
    {
        System.out.println("영상 출력 중");
    }
}

class IPTV implements Computer, TV
{
    ComputerImpl comp=new ComputerImpl();
    TVImpl tv = new TVImpl();

    public void dataReceive()
    {
        comp.dataReceive();
    }
    public void onTV()
    {
        tv.onTV();
    }
    public void powerOn()
    {
        dataReceive();
        onTV();
    }
}

class MultiInheriAlternative
{

    public static void main(String[] args)
    {
        IPTV iptv=new IPTV();
        iptv.powerOn();

        TV tv=iptv;
        Computer comp=iptv;
    }
}
