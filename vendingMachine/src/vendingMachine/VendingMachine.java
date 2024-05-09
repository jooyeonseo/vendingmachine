package vendingMachine;

public interface VendingMachine {
	void displayProducts();
	
	void selectProduct(int product); // 사용자가 선택한 제품을 자판기에 전달하기 
	
	// 사용자에게 동전을 입력하도록 요청
	void displayEnterCoinsMessage();
	
	//동전 입력
	void enterConins(int...coins);
	
	void displayChangeMessage();

}
