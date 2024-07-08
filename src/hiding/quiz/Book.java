package hiding.quiz;

public class Book {

	public static void main(String[] args) {
		BookTest book = new BookTest();
		book.setTitle("자바프로그래밍");
		book.setPrice(20000);
		book.setCompany("한빛컴퍼니");
		book.setPageNo(300);
		
		BookTest book2 = new BookTest();
		book2.setTitle("스프링");
		book2.setPrice(15000);
		book2.setCompany("한빛컴퍼니");
		book2.setPageNo(500);
		
		System.out.println("제목 : " + book.getTitle() + 
						"가격 : " + book.getPrice() +
						"출판사 : " + book.getCompany() + 
						"페이지수 : " + book.getPageNo());
		System.out.println("제목 : " + book2.getTitle() + 
				"가격 : " + book2.getPrice() +
				"출판사 : " + book2.getCompany() + 
				"페이지수 : " + book2.getPageNo());
	}

}

class BookTest{
	private String title;
	private int price;
	private String company;
	private int pageNo;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
}
