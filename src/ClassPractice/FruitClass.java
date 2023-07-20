/*
        실습문제 클래스 만들기2

        과일장수 클래스
        인스턴스 변수
        사과값
        사과개수
        가지고 있는 돈

        메소드
        인스턴스 변수를 초기화 한다.
        구매자에게 돈을 받으면 사과를 건네준다.
        현재 자신의 상태를 출력.

        구매자 클래스
        인스턴스 변수
        사과개수
        가지고 있는 돈

        메소드
        인스턴스 변수를 초기화 한다.
        과일장수에게 돈을 주고 사과를 받는다.
        현재 자신의 상태를 출력.


        과일메인 클래스
        사과장수 두명을 만든다.
        한명은 사과하나의 값은 2000 원이고 사과를 50 개 들고 있고  그리고 가진돈은 50000원이다.
        또 다른 사과장수는 사과하나의 값은 1000원이고 사과를 100개를 들고 있고  그리고 가진돈은 100000원이다.

        구매자는 20000원의 돈을 가지고 있으며 처음에는 사과가 하나도 없다.
        2000원짜리 사과 3개와 1000원짜리 사과 5개를 구매한다.
        우선은 정확히 자신이 사고싶은 만큼의 돈을 넘겨주고 거스름돈은 없는 걸로 하자.
        사과 구매후 3명(과일장수, 구매자)의 상태를 출력한다.
*/
package ClassPractice;

class FruitSeller
{
    int PRICE;
    int numOfApples;
    int money;
    public void initFruitSeller(int PRICE, int numOfApples, int money)
    {
        this.PRICE = PRICE;		// 상수는 메소드 내에서 초기화 할 수 없다.
        this.numOfApples = numOfApples;
        this.money = money;
    }
    public int sell(int money)
    {
        this.money += money;
        int num = money / PRICE;
        this.numOfApples -= num;
        return num;
    }
    public void printCS()
    {
        System.out.println("사과가격 " + PRICE);
        System.out.println("사과개수 " + numOfApples);
        System.out.println("돈 " + money);
    }
}

class Buyer
{
    int numOfApples;
    int money;
    public void initBuyer(int money)
    {
        this.numOfApples = 0;
        this.money = money;
    }
    public void buy(FruitSeller seller, int money)
    {
        this.money -= money;
        this.numOfApples += seller.sell(money);
    }
    public void printCS()
    {
        System.out.println("사과개수 " + numOfApples);
        System.out.println("돈 " + money);
    }
}

class FruitMain
{
    public static void main(String[] args)
    {
        FruitSeller seller1 = new FruitSeller();
        FruitSeller seller2 = new FruitSeller();
        seller1.initFruitSeller(2000, 50, 50000);
        seller2.initFruitSeller(1000, 100, 100000);
        Buyer buyer = new Buyer();
        buyer.initBuyer(20000);

        buyer.buy(seller1, 6000);
        seller1.printCS();
        seller2.printCS();
        buyer.printCS();
        System.out.println("===================");
        buyer.buy(seller2, 5000);
        seller1.printCS();
        seller2.printCS();
        buyer.printCS();
    }
}

