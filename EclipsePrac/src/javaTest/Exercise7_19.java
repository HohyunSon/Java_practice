package javaTest;

class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}
class Buyer {
	int money = 1000;
	Product2[] cart = new Product2[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될
	void buy(Product2 p) {
		if(money<p.price)
		{
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		add(p); 
	}
	void add(Product2 p) {
		if(i>=cart.length)
		{
			Product2[]cart2 = new Product2[cart.length*2];
			for(int i=0;i<cart.length;i++)
			{
				cart2[i]=cart[i];
			}
			cart2[i++]=p;
		}
	} // add(Product p)
	void summary() {
		int sum = 0;
		for(int i=0;i<this.i;i++)
			System.out.println(cart);
			
		for(int i=0;i<cart.length;i++)
			sum+=cart[i].price;
		System.out.println(sum);
		System.out.println(money);
	} // summary()
}
class Product2 {
	int price; // 제품의 가격
	Product2(int price) {
		this.price = price;
	}
}
class Tv2 extends Product2 {
	Tv2() { super(100); }
	public String toString() { return "Tv"; }
}
class Computer extends Product2 {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}
class Audio extends Product2 {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}