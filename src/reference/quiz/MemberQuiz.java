package reference.quiz;

public class MemberQuiz {

	// 책 객체를 3개 생성 후
	Book book = new Book("책1", 11111, "그린컴", 100);
	Book book2 = new Book("책2", 22222, "레드컴", 200);
	Book book3 = new Book("책3", 33333, "블루컴", 300);
	
	// 책을 빌려간 멤버를...
	Member member = new Member(1, "심태훈", book, book2, book3);

}

class Book{
	String title;
	int price;
	String company;
	int pageNo;
	
	public Book(String title, int price, String company, int pageNo) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.pageNo = pageNo;
	}
}

class Member{
	int memberNo;
	String name;
	Book book1;
	Book book2;
	Book book3;
	
	public Member(int memberNo, String name, Book book1, Book book2, Book book3) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	
}
