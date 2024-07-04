package instance.quiz2;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		
		order.orderNo = 1111;
		order.orderDate = "2018년 01월 01일";
	    order.orderName = "둘리";
	    order.orderWhere = "서울시 영등포구 여의도동 20번지";
	    
	    order.showOrderInfo();
	    
	}

}
