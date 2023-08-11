package javaTest;

class SutdaCard3 {
	final int num;
	final boolean isKwang;
	SutdaCard3() {
		this(1, true);
	}
	SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
class Exercise7_14 {
	public static void main(String args[]) {
		SutdaCard3 card = new SutdaCard3(1, true);
	}
}
