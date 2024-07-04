package instance.quiz3;

public class Book {

	String title;
	int price;
	String company;
	int pageNo;
	
	public void showBookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
		System.out.println("출판사 : " + company);
		System.out.println("페이지수 : " + pageNo);
	}
}
