package vendingMachine;

public interface Calculator {

	int calculateTotal(CoinBundle enteredCoins); // 사용자가 넣은 동전 계산
	CoinBundle calculateChange(int amountMoneyToReturn); // 거스름돈 계산 
}
