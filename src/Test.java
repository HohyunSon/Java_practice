
class Seller{
    String name;
    int price;
    int num;
    int money;
    public void init(String name,int price, int num, int money){
        this.name = name;
        this.price = price;
        this.num = num;
        this.money = money;
    }
    public int sell(int money){
        int a = money/price;
        num -= a;
        this.money += money;
        return a;
    }
    public void print(){
        System.out.println(name);
        System.out.println("사과가격 : "+price);
        System.out.println("사과개수 : "+num);
        System.out.println("가진돈 : "+money);
        System.out.println();
    }
}

class Buyer{
    String name;
    int num;
    int money;
    public void init(String name,int money){
        this.name = name;
        num = 0;
        this.money = money;
    }
    public void buy(Seller seller, int money){
        this.money -= money;
        num += seller.sell(money);
    }
    public void print(){
        System.out.println(name);
        System.out.println("사과개수 : "+num);
        System.out.println("가진돈 : "+money);
        System.out.println();
    }
}

class FruitMain{
    public static void main(String[] args) {
        Seller seller1 = new Seller();
        Seller seller2 = new Seller();
        Buyer buyer = new Buyer();

        seller1.init("seller1",1000, 50 , 30000);
        seller2.init("seller2",2000, 30, 100000);
        buyer.init("Buyer",20000);
        buyer.buy(seller1 , 5000);

        System.out.println("첫번째 거래 후 상태확인");
        seller1.print();
        seller2.print();
        buyer.print();
        System.out.println("-------------------");
        buyer.buy(seller2,6000);
        System.out.println("두번째 거래 후 상태확인");
        seller1.print();
        seller2.print();
        buyer.print();
    }
}