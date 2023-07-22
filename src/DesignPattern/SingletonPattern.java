package DesignPattern;

class SimpleNumber
{
    private static SimpleNumber inst; // inst 라는 객체를 static 으로 만들어준다.
    int num=0; // addNum을위한 인스턴스 변수 초기화
    private SimpleNumber() {}	// 생성자 private
    public  void addNum(int n) { num += n; }
    public  void showNum()
    {
        System.out.println(num);
    } //결과 출력

    public static SimpleNumber getSimpleNumberInst() //생성자를 접근하지못해 만들어준 method
    {
        if(inst==null)
            inst = new SimpleNumber(); //inst가 비워져있다면 객체 생성
        return inst; // 아니라면 inst 객체로 돌아감 즉, 하나의 객체에서 반복된다.
    }
}

class OnlyOneINstance2
{
    public static void main(String[] args)
    {
        SimpleNumber num1 = SimpleNumber.getSimpleNumberInst(); //SimpleNumber의 초기화 주소를 지정하는 변수 num 생성 및 메소드 불러오기
        num1.addNum(20); //inst객체에 addNum(20)

        SimpleNumber num2 = SimpleNumber.getSimpleNumberInst(); //SimpleNumber의 초기화 주소를 지정하는 변수 num 생성 및 메소드 불러오기
        num2.addNum(30); //inst객체에 addNum(30)

        num1.showNum();
        num2.showNum();
    }
}