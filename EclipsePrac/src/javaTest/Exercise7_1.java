package javaTest;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=0;i<CARD_NUM;i++)
		{
			if(i==0||i==2||i==7) 
				cards[i] = new SutdaCard(i+1,true);
			else
				cards[i] = new SutdaCard(i+1,false);
			if(i>9) 
				cards[i] = new SutdaCard(i-9,false);
		}
	}
	public void shuffle() {
		int rd = (int)(Math.random()*CARD_NUM);
		for(int i=0;i<CARD_NUM;i++)
		{
			SutdaCard tmp;
			tmp = cards[i];
			cards[i] = cards[rd];
			cards[rd] = tmp;
		}
	}
	public SutdaCard pick(int index) {
		return cards[index];
	}
	public SutdaCard pick() {
		int rd = (int)(Math.random()*CARD_NUM);
		return cards[rd];
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// info() Object toString() . 대신 클래스의 을 오버라이딩했다
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}