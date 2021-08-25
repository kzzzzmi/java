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
		System.out.println("���� ��ȣ : " + indexNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNum);
		System.out.println("�ֹ� �� �ּ� : " + orderAddress);
		System.out.println("�ֹ� ��¥ : " + orderData);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + orderPrice);
		System.out.println("�޴� ��ȣ : " + menuNum);
	}

	public static void main(String[] args) {

		Order order = new Order("202106250003", "01023450001", "�λ�� �ؿ�뱸 �쵿 111-333", 20210625, 130258, 35000, 0003);
		order.showInfo();
				
	}

}