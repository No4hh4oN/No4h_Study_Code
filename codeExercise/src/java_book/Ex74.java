package java_book;

import java.util.Stack;

public class Ex74 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(20));
		coinBox.push(new Coin(70));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(130));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + " 원");
		}
	}
}

class Coin{
	private int coin;
	public Coin(int coin) {
		this.coin = coin;
	}
	public int getValue() {
		// TODO Auto-generated method stub
		return coin;
	}	
}