package sec02.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {//Stack은 나중에 넣은 값이 먼저 나옴 (LIFO)
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
	}

}
