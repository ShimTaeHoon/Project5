package constructor.quiz;

public class BookMain {

	public static void main(String[] args) {

		Book book = new Book();
		book.title = "스프링부트";
		book.price = 30000;
		book.company = "한빛출판사";
		book.pageNo = 200;
		book.BookInfo();
		
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);
//		book2.title = "자바프로그래밍";
//		book2.price = 10000;
//		book2.company = "금빛출판사";
//		book2.pageNo = 300;
//		book2.BookInfo();
		
	}

}
