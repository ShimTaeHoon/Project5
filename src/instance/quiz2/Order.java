package instance.quiz2;

import java.util.Date;

public class Order {

	int orderNo;
	String orderDate;
	String orderName;
	String orderWhere;

	public void showOrderInfo() {
		System.out.println("주문번호 : " + orderNo);
		System.out.println("주문날짜 : " + orderDate);
		System.out.println("주문자이름 : " + orderName);
		System.out.println("배송지: " + orderWhere);
	}
}
