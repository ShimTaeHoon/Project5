package instance.quiz3;

public class BookTest {

	public static void main(String[] args) {

		Book book = new Book();
		book.title = "자바프로그래밍";
		book.price = 20000;
		book.company = "한빛컴퍼니";
		book.pageNo = 300;
		book.showBookInfo();
		System.out.println(book);
		
		Book book2 = new Book();
		book2.title = "스프링";
		book2.price = 15000;
		book2.company = "한빛컴퍼니";
		book2.pageNo = 500;
		book2.showBookInfo();
		System.out.println(book2);
		
	}

}
