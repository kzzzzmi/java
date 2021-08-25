package ch03;

public class Order {

	String indexNum;
	String phoneNum;
	String orderAddress;
	int orderData;
	int orderTime;
	int orderPrice;
	int menuNum;

	public Order(String indexNum, String phoneNum, String orderAddress, int orderData, int orderTime, int orderPrice,
			int menuNum) {
		this.indexNum = indexNum;
		this.phoneNum = phoneNum;
		this.orderAddress = orderAddress;
		this.orderData = orderData;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
	}
	
	public void showInfo() {
		System.out.println("접수 번호 : " + indexNum);
		System.out.println("주문 핸드폰 번호 : " + phoneNum);
		System.out.println("주문 집 주소 : " + orderAddress);
		System.out.println("주문 날짜 : " + orderData);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + menuNum);
	}

	public static void main(String[] args) {

		Order order = new Order("202106250003", "01023450001", "부산시 해운대구 우동 111-333", 20210625, 130258, 35000, 0003);
		order.showInfo();
				
	}

}