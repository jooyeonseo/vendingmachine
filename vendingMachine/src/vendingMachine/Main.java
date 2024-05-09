package vendingMachine;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		VendingMachine vendingMachine = null;
		vendingMachine.displayProducts(); // 자판기 상품 안내
		
		String selectedProduct = scanner.nextLine(); // 상품입력
		int selectProductNumber = Integer.parseInt(selectedProduct); // 상품번호
		
		vendingMachine.selectProduct(selectProductNumber); // 자판기 상품 처리
		// 동전
		vendingMachine.displayEnterCoinsMessage();
		String userEnteredCoins = scanner.nextLine();
		
		int[] enteredCoins = {}; //
		vendingMachine.enterConins(enteredCoins);
		vendingMachine.displayChangeMessage();
		
		
	}

}
