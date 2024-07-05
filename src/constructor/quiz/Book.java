package constructor.quiz;

public class Book {

	String title;
	int price;
	String company;
	int pageNo;
	
	public void BookInfo() {
		System.out.println("제목 : " + title
							+ "가격 : " + price
							+ "출판사 : " + company
							+ "페이지수 : " + pageNo);
		
	}
	
	public Book() {
		super();
	}
	
	public Book(String title, int price, String company, int pageNo) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.pageNo = pageNo;
		System.out.println("제목 : " + title
							+ "가격 : " + price
							+ "출판사 : " + company
							+ "페이지수 : " + pageNo);
	}

}
